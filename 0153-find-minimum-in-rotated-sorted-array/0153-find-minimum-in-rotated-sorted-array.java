class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(nums[low] <= nums[mid]){
                min = (min > nums[low]) ? nums[low] : min;
                low = mid + 1;
            } else {
                min = (min > nums[mid]) ? nums[mid] : min;
                high = mid - 1;
            }
        }
        return min;
    }
}