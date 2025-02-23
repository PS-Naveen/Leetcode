class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String sh = "";
        for(int i = 0 ; i < words.length ; i++){
            sh = sh.concat(words[i]);
            if(sh.equals(s))    return true;
        }
        return false;
    }
}