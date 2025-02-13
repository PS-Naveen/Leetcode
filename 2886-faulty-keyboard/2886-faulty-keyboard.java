class Solution {
    public String finalString(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                ans = new StringBuilder(ans).reverse().toString();
            }
            else{
                ans = ans+s.charAt(i);
            }
        }
        return ans;
    }
}