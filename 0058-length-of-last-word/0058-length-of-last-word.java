class Solution {
    public int lengthOfLastWord(String s) {
        String sh = s.trim();
        String[] arr = sh.split(" ");
        int len = arr[arr.length-1].length();
        return len;
    }
}