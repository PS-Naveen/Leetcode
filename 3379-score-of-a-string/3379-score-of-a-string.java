class Solution {
    public int scoreOfString(String s) {
        int add = 0;
        for(int i = 1 ; i < s.length() ; i++) {
            int j = i -1;
            int minus = ((int) s.charAt(j)) - ((int) s.charAt(i));
            if(minus < 0)   minus*=-1;
            add += minus;
        }
        return add;
    }
}