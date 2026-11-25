class Solution {
    public int diagonalSum(int[][] mat) {
        int m=mat.length, n=mat[0].length;
        boolean arr[][]=new boolean[m][n];
        int sum=0, i=0, j=0;
        while(i<m && j<n){
            if(!arr[i][j])sum+=mat[i][j];
            arr[i][j]=true;
            i++;
            j++;
        }
        i=0;
        j=n-1;
        while(i<m && j>=0){
            if(!arr[i][j])sum+=mat[i][j];
            arr[i][j]=true;
            i++;
            j--;
        }
        return sum;
    }
}