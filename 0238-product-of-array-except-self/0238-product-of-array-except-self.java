class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        out[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            out[i] = out[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i = nums.length-1 ; i >= 0 ; i--){
            out[i] = out[i] * right;
            right *= nums[i];
        }
        return out;
    }
}