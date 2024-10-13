class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length-1 ; i+=2) {
            int j = i + 1;
            int temp1 = nums[i];
            int temp2 = nums[j];
            arr[i] = temp2;
            arr[j] = temp1;
        }
        return arr;
    }
}