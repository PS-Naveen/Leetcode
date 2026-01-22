class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = 200;
        int targetNumber = (int) target;
        for(int i = 0 ; i < letters.length ; i++){
            int num = (int) letters[i];
            if(num != targetNumber && target < num && num < min){
                min = num;
            }
        }
        if(min == 200){
            for(int i = 0 ; i < letters.length ; i++){
                int num = (int) letters[i];
                if(num != targetNumber && num < min){
                    min = num;
                }
            }
        }
        return (char) min;
    }
}