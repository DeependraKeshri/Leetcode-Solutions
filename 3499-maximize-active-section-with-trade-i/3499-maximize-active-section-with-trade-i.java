class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        sb.append('1');
        sb.append(s);
        sb.append('1');
        int len = sb.length();
        int ones = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        int ans = ones;
        int i = 0;
        while (i < len) {
            if (sb.charAt(i) == '1') {
                int start = i;
                while (i < len && sb.charAt(i) == '1') {
                    i++;
                }
                int end = i - 1;
                if (start > 0 && i < len &&
                    sb.charAt(start - 1) == '0' &&
                    sb.charAt(i) == '0') {
                    int leftZeros = 0;
                    int j = start - 1;
                    while (j >= 0 && sb.charAt(j) == '0') {
                        leftZeros++;
                        j--;
                    }
                    int rightZeros = 0;
                    j = i;
                    while (j < len && sb.charAt(j) == '0') {
                        rightZeros++;
                        j++;
                    }
                    ans = Math.max(ans, ones + leftZeros + rightZeros);
                }
            } else {
                i++;
            }
        }
        return ans;
    }
}