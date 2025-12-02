class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0)return false;
        return helper(grid, 0,0,0);
    }
    public boolean helper(int [][]grid, int rows, int col, int num){
        int n=grid.length;
        if(grid[rows][col]==n*n-1)return true;
        //top-left
        int i=rows-2;
        int j=col-1;
        if(i>-1 && j>-1 && grid[i][j]==num+1) return helper(grid, i, j, num+1);
        //top-right
        i=rows-2;
        j=col+1;
        if(i>-1 && j<n && grid[i][j]==num+1) return helper(grid, i, j, num+1);
        //bottom-left
        i=rows+2;
        j=col-1;
        if(i<n && j>-1 && grid[i][j]==num+1) return helper(grid, i, j, num+1);
        //bottom-right
        i=rows+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]==num+1) return helper(grid, i, j, num+1);
        //mid-top-left
        i=rows-1;
        j=col-2;
        if(i>-1 && j>-1 && grid[i][j]==num+1) return helper(grid, i, j, num+1);
        //mid-bottom-left
        i=rows+1;
        j=col-2;
        if(i<n && j>-1 && grid[i][j]==num+1) return helper(grid, i, j, num+1);
        //mid-top-right
        i=rows-1;
        j=col+2;
        if(i>-1 && j<n && grid[i][j]==num+1) return helper(grid, i, j, num+1);
        //mid-bottom-right
        i=rows+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]==num+1) return helper(grid, i, j, num+1);
        return false;
    }
}