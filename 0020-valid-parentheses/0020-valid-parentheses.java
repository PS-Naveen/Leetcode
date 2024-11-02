class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack <>();
        List<Integer> ls = new ArrayList<>();
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < s.length() ; i++) {
            if(stk.size() == 0) {
                stk.push(arr[i]);
                ls.add(i);
            } else if (arr[i] == ')' && stk.peek() == '(') {
                stk.pop();
            } else if (arr[i] == ']' && stk.peek() == '[') {
                stk.pop();
            } else if (arr[i] == '}' && stk.peek() == '{') {
                stk.pop();
            } else {
                stk.push(arr[i]);
            }
        }
        if(stk.size() == 0)   return true;
        return false;
    }
}
