class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n, costs, dp);
    }
    public int helper(int n, int[] costs, int[] dp) {
        if (n == 0) return 0;
        if (dp[n] != -1) return dp[n];
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= 3; i++) {
            if (n - i >= 0) {
                int cost = helper(n - i, costs, dp)
                         + costs[n - 1] + (i * i);

                ans = Math.min(ans, cost);
            }
        }
        return dp[n] = ans;
    }
}
