class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        String sep = "[" + separator + "]";
        List<String> arr = new ArrayList<>();
        for(int i = 0 ; i < words.size() ; i++) {
            String[] word = (words.get(i)).split(sep);
            for (int j = 0 ; j < word.length ; j++) {
                System.out.println(word[j]);
                if(word[j] != ""){
                    arr.add(word[j].trim());
                }
            }
        }
        return arr;
    }
}