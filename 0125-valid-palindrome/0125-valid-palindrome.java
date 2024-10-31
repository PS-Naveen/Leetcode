class Solution {
    public boolean isPalindrome(String s) {
        String sh = "";
	    for (int i = 0 ; i < s.length(); i++) {
	        int temp = (char) (s.charAt(i));
	        if ((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122) || (temp >= 48 && temp <= 57)) {
	            char a = Character.toLowerCase(s.charAt(i));
	            sh = sh + a;
	        }
	    }
	    boolean ans = ispalindrome(sh);
        return ans;
    }
    
    static boolean ispalindrome (String sh) {
	    int len = sh.length();
	    int start = 0;
	    return recurse(start, len, sh);
	}

	static boolean recurse (int start, int len, String sh) {
	    if (start >= len/2) return true;
	    if (sh.charAt(start) != sh.charAt(len-start-1)) return false;
	    return recurse(start+1, len, sh);
	}
}