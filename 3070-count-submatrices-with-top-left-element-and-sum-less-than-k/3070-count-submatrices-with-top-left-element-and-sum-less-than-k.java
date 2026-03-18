class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int count=0;
        int prefixSum[][]=new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            prefixSum[i][0]=grid[i][0];
            for(int j=1; j<grid[i].length; j++){
                prefixSum[i][j]=prefixSum[i][j-1]+grid[i][j];
            }
        }
        for(int i=1; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                prefixSum[i][j]+=prefixSum[i-1][j];
            }
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(prefixSum[i][j]<=k)count++;
            }
        }
        return count;
    }
}