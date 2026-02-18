class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        Set<Integer> hs = new HashSet<>();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
            hs.add(nums[i]);
        }
        for(int i = min+1 ; i < max ; i++){
            if(!hs.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}