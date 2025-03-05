class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int prefix = 1;
        int sufix = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(prefix == 0) prefix = 1;
            if(sufix == 0) sufix = 1;
            prefix *= nums[i];
            sufix *= nums[nums.length-i-1];
            int currMax = (prefix > sufix) ? prefix : sufix;
            max = (max > currMax) ? max : currMax;
        }
        return max;
    }
}