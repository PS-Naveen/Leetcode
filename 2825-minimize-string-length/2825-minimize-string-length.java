class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> ch = new HashSet<>();
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(!ch.contains(s.charAt(i))){
                ch.add(s.charAt(i));
                count++;
            }
        }
        return count;
    }
}