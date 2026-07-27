class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0, e=matrix[0].length-1;
        while(s<matrix.length && e>=0){
            if(target==matrix[s][e])return true;
            else if(target>matrix[s][e])s++;
            else e--;
        }
        return false;
    }
}