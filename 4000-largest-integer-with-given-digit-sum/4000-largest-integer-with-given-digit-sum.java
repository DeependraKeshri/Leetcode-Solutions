class Solution {
    public int largestInteger(int n, int s) {
        if (s == 0) return 0;
        if (s > n * 9) return -1;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append('9');
            n--;
        }
        while (true) {
            int sum = 0;
            for (int i = 0; i < sb.length(); i++) {
                sum += sb.charAt(i) - '0';
            }
            if (sum == s) {
                return Integer.parseInt(sb.toString());
            }
            int i = sb.length() - 1;
            if (sb.charAt(i) == '0') {
                while (i > 0 && sb.charAt(i) == '0') {
                    i--;
                }
                sb.setCharAt(i, (char)(sb.charAt(i) - 1));
                i++;
                while (i < sb.length()) {
                    sb.setCharAt(i, '9');
                    i++;
                }
            } else {
                sb.setCharAt(i, (char)(sb.charAt(i) - 1));
            }
        }
    }
}