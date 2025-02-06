class Solution {
    public boolean isPowerOfTwo(int n) {
        double cur = n;
        while(cur > 1.0){
            cur = cur / 2;
        }
        if(cur == 1.0)   return true;
        return false;
    }
}