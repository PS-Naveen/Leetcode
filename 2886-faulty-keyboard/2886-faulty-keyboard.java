class Solution {
    public String finalString(String s) {
        String out = "";
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == 'i'){
                out = reverse(out);
            } else {
                out += s.charAt(i);
            }
        }
        return out;
    }

    public String reverse (String rev) {
        String out = "";
        for(int i = rev.length()-1 ; i >= 0; i--) {
            out += rev.charAt(i);
        }
        return out;
    }
}