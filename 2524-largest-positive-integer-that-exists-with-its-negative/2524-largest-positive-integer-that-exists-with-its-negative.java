class Solution {
    public int findMaxK(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        Arrays.sort(nums);
        while(left < right){
            if(nums[right] == (-1 * nums[left]))    return nums[right];
            if(nums[left] < (nums[right] * -1)) {
                left++;
            } else {
                right--;
            }
        }
        return -1;
    }
}