class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0; i<grid.length; i++){
            int s=0, e=grid[i].length-1;
            while(s<=e){
                int m=(e+s)/2;
                if(grid[i][m]<0){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }
            count+=grid[i].length-s;
        }
        return count;
    }
}