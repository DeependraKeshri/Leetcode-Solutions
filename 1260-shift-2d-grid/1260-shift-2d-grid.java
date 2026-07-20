class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        while (k-- > 0) {
            int last = grid[m - 1][n - 1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int temp = grid[i][j];
                    grid[i][j] = last;
                    last = temp;
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++)
                row.add(grid[i][j]);
            ans.add(row);
        }
        return ans;
    }
}