class Solution {
    Integer[][][] dp;
    static final int MOD = 1_000_000_007;

    public int numberOfPaths(int[][] grid, int k) {
        dp = new Integer[grid.length][grid[0].length][k];
        return totPath(grid, 0, k, 0, 0);
    }

    public int totPath(int [][]grid, int sum, int k, int i, int j) {
        if (i >= grid.length || j >= grid[0].length) return 0;
        sum = (sum + grid[i][j]) % k;
        if (dp[i][j][sum] != null) return dp[i][j][sum];
        if (i == grid.length - 1 && j == grid[0].length - 1)
            return dp[i][j][sum] = (sum == 0 ? 1 : 0);
        int r = totPath(grid, sum, k, i + 1, j);
        int d = totPath(grid, sum, k, i, j + 1);
        return dp[i][j][sum] = (int)(((long)r + d) % MOD);
    }
}
