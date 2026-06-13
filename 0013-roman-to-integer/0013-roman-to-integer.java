class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);
        int total = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int current = hs.get(s.charAt(i));
            if(i < s.length() - 1 && current < hs.get(s.charAt(i+1))){
                total -= current;
            } else {
                total += current;
            }  
        }
        return total;
    }
}