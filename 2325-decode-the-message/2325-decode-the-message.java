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

        String s = new String();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch == ' ') s+=' ';
            else s+=arr[ch - 'a'];
        }
        return s;
    }
}
