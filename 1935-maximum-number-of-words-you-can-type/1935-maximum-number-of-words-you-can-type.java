class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c = 0;
        boolean val = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!val) c++;
                val = false;
            } else {
                if (brokenLetters.indexOf(ch)!=-1) val = true;
                if (i == text.length() - 1 && !val) c++;
            }
        }
        return c;
    }
}