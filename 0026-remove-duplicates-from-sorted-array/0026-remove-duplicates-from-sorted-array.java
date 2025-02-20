class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = nums.length-1 ; i > 0 ; i--) {
            if(nums[i] == nums[i-1]){
                nums[i] = -200;
                count++;
            }
        }
        int j = 0;
        int k = j+1;
        while(k < nums.length){
            if(nums[j] == -200 && nums[k] != -200){
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
            } else if (nums[j] != -200){
                j++;
                k++;
            } else {
                k++;
            }
        }
        return nums.length-count;
    }
}