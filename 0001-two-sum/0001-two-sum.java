class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int temp = target - nums[i];
            if(hm.containsKey(temp)){
                int indx = hm.get(temp);
                return new int[]{i, indx};
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}