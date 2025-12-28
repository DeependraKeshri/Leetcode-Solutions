class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0; i<grid.length; i++){
            int j=0;
            while(j<grid[i].length && grid[i][j]>-1)j++;
            count+=(grid[i].length-j);
        }
        return count;
    }
}