class Solution {
    public String decodeMessage(String key, String message) {
        Character arr[] = new Character[26];
        char curr = 'a';

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && arr[ch - 'a'] == null) {
                arr[ch - 'a'] = curr;
                curr++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch == ' ') sb.append(' ');
            else sb.append(arr[ch - 'a']);
        }
        return sb.toString();
    }
}
