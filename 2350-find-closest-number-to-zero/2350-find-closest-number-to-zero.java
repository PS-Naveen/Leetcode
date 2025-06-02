class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MIN_VALUE;
        int minVal = Integer.MIN_VALUE;
        if(nums[0] < 0) {
            min = (nums[0]*-1);
            minVal = nums[0];
        } else {
            min = nums[0];
            minVal = nums[0];
        }
        for(int i = 1 ; i < nums.length ; i++){
            int curr = nums[i];
            if(curr < 0) curr = (curr*-1);
            if(curr < min){
                min = curr;
                minVal = nums[i];
            } else if (curr == min) {
                if(minVal < nums[i]){
                    min = curr;
                    minVal = nums[i];
                }
            }
        }
        return minVal;
    }
}