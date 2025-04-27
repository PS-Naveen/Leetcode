class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for(int i = 1 ; i < nums.length-1 ; i++){
            int prev = nums[i-1];
            int after = nums[i+1];
            if(((prev + after) * 2) == nums[i]) count++;
        }
        return count;
    }
}