class Solution {
    public int alternatingSum(int[] nums) {
        int tot = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(i%2 != 0){
                tot -= nums[i];
            } else {
                tot += nums[i];
            }
        }
        return tot;
    }
}