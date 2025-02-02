class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> hs1 = new HashMap<>();
        HashMap<Character, Character> hs2 = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if((hs1.containsKey(a) && hs1.get(a) != b) || (hs2.containsKey(b) && hs2.get(b) != a))
            return false;
            hs1.put(a,b);
            hs2.put(b,a);
        }
        return true;
    }
}