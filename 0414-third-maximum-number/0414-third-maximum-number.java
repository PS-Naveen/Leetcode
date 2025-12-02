class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(nums);
        for(int i = nums.length-1 ; i >= 0 ; i--){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                arr.add(nums[i]);
            }
        }
        if(arr.size() > 2){
            return arr.get(2);
        }
        return arr.get(0);
    }
}