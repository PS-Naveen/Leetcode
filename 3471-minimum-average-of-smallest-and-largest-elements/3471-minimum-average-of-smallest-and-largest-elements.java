class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double[] avg = new double[nums.length/2];
        int left = 0;
        int right = nums.length - 1;
        double min = ((nums[left] + nums[right])*1.0)/2;
        int indx = 0;
        int i = 0;
        int count = nums.length/2;
        while(i < count && left < right) {
           if(((nums[left] + nums[right])*1.0)/2 < min) min = ((nums[left] + nums[right])*1.0)/2;
            avg[indx] = ((nums[left] + nums[right])*1.0)/2;
            left++;
            right--;
            count++;
        }
        return min;
    }
}