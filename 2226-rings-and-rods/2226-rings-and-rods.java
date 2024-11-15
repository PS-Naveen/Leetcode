class Solution {
    public int countPoints(String rings) {
        HashMap<Integer , String> hs = new HashMap<>();
        int out = 0;
        int len = rings.length();
        for(int i = 0 ; i < len-1 ; i+=2) {
            String ringColor = "" + rings.charAt(i);
            String str = ""+rings.charAt(i+1);
            int index = Integer.valueOf(str);
            if(hs.containsKey(index)){   
                String ringClr = hs.get(index);
                if(!ringClr.contains(ringColor)) {
                    ringClr += ringColor;
                    hs.put(index, ringClr);
                    int count = (hs.get(index)).length();
                    if(count == 3) out += 1;
                }             
            } else {
                hs.put(index, ringColor);
            }
        }
        return out;
    }
}