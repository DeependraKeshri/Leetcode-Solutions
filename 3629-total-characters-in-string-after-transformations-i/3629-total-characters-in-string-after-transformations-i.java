class Solution {
    static final int MOD = 1000000007;

    public int lengthAfterTransformations(String s, int t) {
        long[] dp = new long[26];
        for (char c : s.toCharArray()) dp[c - 'a']++;

        for (int i = 0; i < t; i++) {
            long[] next = new long[26];
            for (int j = 0; j < 26; j++) {
                if (j == 25) { // 'z'
                    next[0] = (next[0] + dp[25]) % MOD; // 'a'
                    next[1] = (next[1] + dp[25]) % MOD; // 'b'
                } else {
                    next[j + 1] = (next[j + 1] + dp[j]) % MOD;
                }
            }
            dp = next;
        }

        long ans = 0;
        for (long x : dp) ans = (ans + x) % MOD;
        return (int) ans;
    }
}
