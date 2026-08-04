class Solution {
    public boolean isPalindrome(String s) {
        int st = 0, e = s.length() - 1;

        while (st <= e) {

            int s1 = s.charAt(st) - 'a';
            int s2 = s.charAt(st) - 'A';

            int e1 = s.charAt(e) - 'a';
            int e2 = s.charAt(e) - 'A';

            boolean leftLetter =
                (s1 >= 0 && s1 < 26) || (s2 >= 0 && s2 < 26);

            boolean rightLetter =
                (e1 >= 0 && e1 < 26) || (e2 >= 0 && e2 < 26);

            boolean leftDigit =
                s.charAt(st) >= '0' && s.charAt(st) <= '9';

            boolean rightDigit =
                s.charAt(e) >= '0' && s.charAt(e) <= '9';

            if (!leftLetter && !leftDigit) {
                st++;
            } 
            else if (!rightLetter && !rightDigit) {
                e--;
            } 
            else {
                if (Character.toLowerCase(s.charAt(st)) !=
                    Character.toLowerCase(s.charAt(e))) {
                    return false;
                }

                st++;
                e--;
            }
        }
        return true;
    }
}