class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            } else {
                if(!ans.contains(nums[i])){
                    arr.add(nums[i]);
                    ans.add(nums[i]);
                }
            }
        }
        int[] ar = new int[arr.size()];
        for(int i = 0 ; i < arr.size() ; i++){
            ar[i] = arr.get(i);
        }
        return ar;
    }
}