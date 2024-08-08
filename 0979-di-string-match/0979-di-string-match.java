class Solution {
    public int[] diStringMatch(String s) {
        int size = s.length();
        int low = 0;
        int high = size;
        int[] arr = new int[size+1];
        for (int i = 0 ; i < size ; i++) {
            if(s.charAt(i) == 'I'){
                arr[i] = low;
                low += 1;
            } else {
                arr[i] = high;
                high -= 1;
            }
        }
        arr[size] = low;
        return arr;
    }
}