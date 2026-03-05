class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m=grid.length;
        int ans[][]=new int[m-2][m-2];
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans.length; j++){
                int max=Integer.MIN_VALUE;
                for(int k=i; k<i+3; k++){
                    for(int l=j; l<j+3; l++){
                        if(grid[k][l]>max)max=grid[k][l];
                    }
                }
                ans[i][j]=max;
            }
        }
        return ans;
    }
}