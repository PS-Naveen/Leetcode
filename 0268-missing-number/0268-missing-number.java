class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(i != nums[i])    return i;
        }
        return len;
    }
}