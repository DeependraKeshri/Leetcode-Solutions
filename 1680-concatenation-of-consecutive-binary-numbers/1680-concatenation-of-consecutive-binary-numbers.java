class Solution {
    public int concatenatedBinary(int n) {
        long val = 0;
        int MOD = 1000000007;

        for (int i = 1; i <= n; i++) {
            String s = Integer.toBinaryString(i);

            for (int j = 0; j < s.length(); j++) {
                val = (val << 1) % MOD;

                if (s.charAt(j) == '1') {
                    val = (val + 1) % MOD;
                }
            }
        }

        return (int) val;
    }
}