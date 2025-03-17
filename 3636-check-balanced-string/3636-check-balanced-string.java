class Solution {
    public boolean isBalanced(String num) {
        int odd = 0;
        int even = 0;
        for (int i = 0 ; i < num.length() ; i++) {
            int j = Integer.parseInt(num.charAt(i) + "");
            if(i%2 == 0) {
                even += j;
            } else {
                odd += j;
            }
        }
        if(odd == even)return true;
        return false;
    }
}