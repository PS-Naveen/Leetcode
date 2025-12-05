class Solution {
    public int minOperations(int[] nums, int k) {
        int totCount = nums.length;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= k)    count++;
        }
        return totCount-count;
    }
}