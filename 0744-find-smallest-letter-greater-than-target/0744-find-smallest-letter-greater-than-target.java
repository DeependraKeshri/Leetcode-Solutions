class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (letters[m] <= target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        if (s < letters.length) {
            return letters[s];
        }
        return letters[0];
    }
}
