class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] fin = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            int j = 0;
            while(j < nums.length){
                if(nums[i] != nums[j] && nums[i] > nums[j]){
                    count++;
                }
                j++;
            }
            fin[i] = count;
        }
        return fin;
    }
}