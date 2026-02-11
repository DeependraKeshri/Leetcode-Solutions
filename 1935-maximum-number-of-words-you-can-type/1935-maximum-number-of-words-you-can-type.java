class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        int i = 0;

        while (i < text.length()) {
            boolean valid = true;

            while (i < text.length() && text.charAt(i) != ' ') {
                for (int j = 0; j < brokenLetters.length(); j++) {
                    if (text.charAt(i) == brokenLetters.charAt(j)) {
                        valid = false;
                        break;
                    }
                }
                i++;
            }

            if (valid) count++;

            i++;
        }

        return count;
    }
}
