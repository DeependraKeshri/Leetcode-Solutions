class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                set.add(grid[i][j]);

                int max = Math.min(Math.min(j, n - j - 1), (m - i - 1) / 2);

                for (int k = 1; k <= max; k++) {
                    int sum = 0;

                    for (int t = 0; t < k; t++) sum += grid[i + t][j + t];
                    for (int t = 0; t < k; t++) sum += grid[i + k + t][j + k - t];
                    for (int t = 0; t < k; t++) sum += grid[i + 2 * k - t][j - t];
                    for (int t = 0; t < k; t++) sum += grid[i + k - t][j - k + t];

                    set.add(sum);
                }
            }
        }

        int size = Math.min(3, set.size());
        int[] res = new int[size];
        int idx = 0;

        for (int val : set) {
            if (idx == size) break;
            res[idx++] = val;
        }

        return res;
    }
}