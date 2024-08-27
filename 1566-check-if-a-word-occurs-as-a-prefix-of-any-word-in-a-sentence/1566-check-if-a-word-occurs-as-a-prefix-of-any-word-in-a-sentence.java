class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int pos = -1;
        String[] arr = sentence.split(" ");
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i].contains(searchWord)){
                boolean flag = true;
                for(int j = 0 ; j < searchWord.length() ; j++){
                    if(searchWord.charAt(j) != arr[i].charAt(j)){
                        flag = false;
                    }
                }
                if(flag){
                    pos=i+1;
                    return pos;
                }   
            }
        }
        return pos;
    }
}