class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        if (r < 3 || c < 3) return 0;

        int[][] row = new int[r + 1][c + 1];
        int[][] col = new int[r + 1][c + 1];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                row[i + 1][j + 1] = row[i + 1][j] + grid[i][j];
                col[i + 1][j + 1] = col[i][j + 1] + grid[i][j];
            }
        }

        int count = 0;

        for (int i = 0; i + 2 < r; i++) {
            for (int j = 0; j + 2 < c; j++) {
                boolean[] seen = new boolean[10];
                boolean valid = true;

                for (int x = i; x <= i + 2; x++) {
                    for (int y = j; y <= j + 2; y++) {
                        int v = grid[x][y];
                        if (v < 1 || v > 9 || seen[v]) {
                            valid = false;
                            break;
                        }
                        seen[v] = true;
                    }
                    if (!valid) break;
                }

                if (!valid) continue;

                int s = row[i + 1][j + 3] - row[i + 1][j];

                for (int x = i; x <= i + 2; x++) {
                    int rs = row[x + 1][j + 3] - row[x + 1][j];
                    if (rs != s) {
                        valid = false;
                        break;
                    }
                }

                for (int y = j; y <= j + 2 && valid; y++) {
                    int cs = col[i + 3][y + 1] - col[i][y + 1];
                    if (cs != s) {
                        valid = false;
                        break;
                    }
                }

                int d1 = grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2];
                int d2 = grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j];

                if (d1 != s || d2 != s) valid = false;

                if (valid) count++;
            }
        }
        return count;
    }
}
