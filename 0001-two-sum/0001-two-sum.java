class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int rem = target - nums[i];
            if(hm.containsKey(rem)) {
                return new int[] {i, hm.get(rem)};
            }
            hm.put(nums[i], i);
        }
        return arr;
    }
}