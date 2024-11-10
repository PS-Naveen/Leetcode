class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> banned = new HashSet<>();
        for (String msg : bannedWords) {
            banned.add(msg);
        }
        int count = 0;
        for (String word : message) {
            if (banned.contains(word)) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}