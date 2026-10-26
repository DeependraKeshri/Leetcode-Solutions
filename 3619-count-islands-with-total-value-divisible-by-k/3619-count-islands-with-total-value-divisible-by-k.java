class Solution {
    int m, n;
    boolean[][] island;
    public int countIslands(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;
        island = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!island[i][j] && grid[i][j] != 0) {
                    long sum = helper(grid, i, j);
                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public long helper(int[][] grid, int r, int c) {
        if (r < 0 || r >= m || c < 0 || c >= n ||
            island[r][c] || grid[r][c] == 0) {
            return 0;
        }
        island[r][c] = true;
        long sum = grid[r][c];
        sum += helper(grid, r + 1, c);
        sum += helper(grid, r - 1, c);
        sum += helper(grid, r, c + 1);
        sum += helper(grid, r, c - 1);
        return sum;
    }
}