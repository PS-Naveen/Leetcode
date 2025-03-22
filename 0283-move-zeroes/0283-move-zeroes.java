class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        while (i < nums.length-1) {
	        int j = i+1;
	        while (j < nums.length) {
	            if (nums[i] == 0 && nums[j] != 0) {
	                int temp = nums[i];
    	            nums[i] = nums[j];
    	            nums[j] = temp;
    	            break;
	            }
	            j++;
	        }
	        i+=1;
	    }
    }
}