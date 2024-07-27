class Solution {
    public int findNonMinOrMax(int[] nums) {
        int out = -1;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != min && nums[i] != max)    out = nums[i];
        }
        return out;
    }
}