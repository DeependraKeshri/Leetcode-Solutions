class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length, n = heightMap[0].length;
        if (m <= 2 || n <= 2) return 0;

        int[][] water = new int[m][n];

        // Step 1: Initialize water levels
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m-1 || j == 0 || j == n-1) {
                    water[i][j] = heightMap[i][j]; // boundary fixed
                } else {
                    water[i][j] = Integer.MAX_VALUE; // initially assume very high water
                }
            }
        }

        // Step 2: Relax water heights until stable
        boolean changed = true;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (changed) {
            changed = false;
            for (int i = 1; i < m-1; i++) {
                for (int j = 1; j < n-1; j++) {
                    int minNeighbor = Integer.MAX_VALUE;
                    for (int[] d : dirs) {
                        int ni = i + d[0], nj = j + d[1];
                        minNeighbor = Math.min(minNeighbor, water[ni][nj]);
                    }

                    int newWater = Math.max(heightMap[i][j], minNeighbor);
                    if (newWater < water[i][j]) {
                        water[i][j] = newWater;
                        changed = true;
                    }
                }
            }
        }

        // Step 3: Calculate trapped water
        int total = 0;
        for (int i = 1; i < m-1; i++) {
            for (int j = 1; j < n-1; j++) {
                total += water[i][j] - heightMap[i][j];
            }
        }

        return total;
    }
}
