class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        long total = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                total += grid[i][j];
            }
        }

        long prefix = 0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                prefix += grid[i][j];
            }
            if(prefix == total - prefix) return true;
        }

        prefix = 0;
        for(int j=0;j<n-1;j++){
            for(int i=0;i<m;i++){
                prefix += grid[i][j];
            }
            if(prefix == total - prefix) return true;
        }

        return false;
    }
}