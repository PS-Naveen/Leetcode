class Solution {
    public String reverseVowels(String s) {
        String str = "";
        int j = 0;
        String out = "";
        for(int i = 0 ; i < s.length() ; i++){
            boolean flag = vowels(s.charAt(i));
            if(flag){
                str += s.charAt(i);
            }
        }
        j = str.length()-1;
        for(int i = 0 ; i < s.length() ; i++){
            boolean flag = vowels(s.charAt(i));
            if(flag){
                out += str.charAt(j);
                j--;
            } else {
                out += s.charAt(i);
            }
        }
        return out;
    }
    public boolean vowels(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        } else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }
}