class Solution {
    public boolean areOccurrencesEqual(String s) {
        int count = -1;
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i)+"")){
                int val = hm.get(s.charAt(i)+"");
                hm.put(s.charAt(i)+"", val+1);
            } else {
                hm.put(s.charAt(i)+"", 1);
            }
        }
        for(int val : hm.values()){
            if(count == -1){
                count = val;
            } else {
                if(count != val)    return false;
            }
        }
        return true;
    }
}