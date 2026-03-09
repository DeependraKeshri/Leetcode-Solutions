class Solution {
    static final int MOD = 1000000007;
    public int numberOfStableArrays(int zero, int one, int limit) {
        long[][][] dp = new long[zero + 1][one + 1][2];
        for (int z = 1; z <= Math.min(zero, limit); z++) {
            dp[z][0][0] = 1;
        }
        for (int o = 1; o <= Math.min(one, limit); o++) {
            dp[0][o][1] = 1;
        }
        for (int z = 1; z <= zero; z++) {
            for (int o = 1; o <= one; o++) {

                for (int k = 1; k <= limit && z - k >= 0; k++) {
                    dp[z][o][0] = (dp[z][o][0] + dp[z - k][o][1]) % MOD;
                }

                for (int k = 1; k <= limit && o - k >= 0; k++) {
                    dp[z][o][1] = (dp[z][o][1] + dp[z][o - k][0]) % MOD;
                }
            }
        }
        return (int)((dp[zero][one][0] + dp[zero][one][1]) % MOD);
    }
}