class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> st = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            st.add(brokenLetters.charAt(i));
        }

        int c = 0;
        boolean val = false;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                if (!val) c++;
                val = false;
            } else {
                if (st.contains(ch)) val = true;
                if (i == text.length() - 1 && !val) c++;
            }
        }
        return c;
    }
}
