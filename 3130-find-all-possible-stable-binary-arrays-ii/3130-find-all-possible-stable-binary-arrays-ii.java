class Solution {
    static final int MOD = 1000000007;

    public int numberOfStableArrays(int zero, int one, int limit) {

        long[][] dp0 = new long[zero + 1][one + 1];
        long[][] dp1 = new long[zero + 1][one + 1];

        for (int i = 1; i <= Math.min(limit, zero); i++) {
            dp0[i][0] = 1;
        }

        for (int i = 1; i <= Math.min(limit, one); i++) {
            dp1[0][i] = 1;
        }

        for (int z = 1; z <= zero; z++) {
            for (int o = 1; o <= one; o++) {

                dp0[z][o] = (dp0[z][o] + dp0[z-1][o] + dp1[z-1][o]) % MOD;
                if (z - limit - 1 >= 0) {
                    dp0[z][o] = (dp0[z][o] - dp1[z-limit-1][o] + MOD) % MOD;
                }

                dp1[z][o] = (dp1[z][o] + dp0[z][o-1] + dp1[z][o-1]) % MOD;
                if (o - limit - 1 >= 0) {
                    dp1[z][o] = (dp1[z][o] - dp0[z][o-limit-1] + MOD) % MOD;
                }
            }
        }

        return (int)((dp0[zero][one] + dp1[zero][one]) % MOD);
    }
}