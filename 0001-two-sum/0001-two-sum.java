class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int value = target - nums[i];
            if(hs.containsKey(value)){
                return new int[] {i, hs.get(value)};
            } else {
                hs.put(nums[i], i);
            }
        }
        return new int[] {0, 0};
    }
}