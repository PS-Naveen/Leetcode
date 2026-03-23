class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];
            int indexValue = 0;
            while(num > 0){
                indexValue = indexValue + (num%10);
                num = num / 10;
            }
            if(i == indexValue)  return i;
        }
        return -1;
    }
}