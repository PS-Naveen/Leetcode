class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(str.length != pattern.length())   return false;
        HashMap<Character , String> map = new HashMap<>();
        HashMap<String , Character> map2 = new HashMap<>();
        char[] pat = new char[pattern.length()];
        for(int i = 0 ; i < pattern.length() ; i++){
            pat[i] = pattern.charAt(i);
        }
        //int min = (pattern.length() > str.length) ? str.length : pattern.length();
        for(int i = 0 ; i < str.length ; i++){
            if(map.containsKey(pat[i]) && !map.get(pat[i]).equals(str[i]))  return false;
            if(map2.containsKey(str[i]) && map2.get(str[i]) != pat[i])  return false;
            map.put(pat[i], str[i]);
            map2.put(str[i], pat[i]);
        }
        return true;
    }
}