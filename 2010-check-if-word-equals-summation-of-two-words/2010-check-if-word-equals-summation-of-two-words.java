class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String fW = "";
		String sW = "";
		String tW = "";
		for (int i = 0 ; i < firstWord.length() ; i++) {
		    fW = fW + ((int) firstWord.charAt(i) - 97);
		}
		for (int i = 0 ; i < secondWord.length() ; i++) {
		    sW = sW + ((int) secondWord.charAt(i) - 97);
		}
		for (int i = 0 ; i < targetWord.length() ; i++) {
		    tW = tW + ((int) targetWord.charAt(i) - 97);
		}
		int first = Integer.parseInt(fW);
		int second = Integer.parseInt(sW);
		int target = Integer.parseInt(tW);
		if(first + second == target)   return true;
		return false;
    }
}