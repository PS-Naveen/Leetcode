class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {
            if(hm.containsKey(nums[i])){
                int val = hm.get(nums[i]);
                hm.put(nums[i], val+1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        int key;
        for(int i = 0 ; i < nums.length ; i++){
            int val = nums[i];
            if(1 == hm.get(val)){
                return val;
            }
        }
        return 0;
    }
}