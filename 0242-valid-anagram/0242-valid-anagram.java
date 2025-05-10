
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;
        HashMap<String , Integer> hashMap1 = new HashMap<>();
        HashMap<String , Integer> hashMap2 = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(!hashMap1.containsKey(s.charAt(i) + "")){
                hashMap1.put(s.charAt(i) + "", 1);
            } else {
                int val = hashMap1.get(s.charAt(i) + "");
                hashMap1.put(s.charAt(i) + "", val+1);
            }
            if(!hashMap2.containsKey(t.charAt(i) + "")){
                hashMap2.put(t.charAt(i) + "", 1);
            } else {
                int val = hashMap2.get(t.charAt(i) + "");
                hashMap2.put(t.charAt(i) + "", val+1);
            }
        }
        for(int i = 0 ; i < s.length() ; i++){
            String key = s.charAt(i) + "";
            if(!(hashMap1.containsKey(key) && hashMap2.containsKey(key)))   return false;
            int hm1 = hashMap1.get(key);
            int hm2 = hashMap2.get(key);
            if(hm1 != hm2){
                return false;
            }
        }
        return true;
    }
}