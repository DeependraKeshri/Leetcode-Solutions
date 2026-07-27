class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int sr=0, er=matrix.length-1;
        while(sr<=er){
            int mr=sr+(er-sr)/2;
            int sc=0, ec=matrix[mr].length-1;
            if(target==matrix[mr][sc] || matrix[mr][ec]==target)return true;
            else if(target<matrix[mr][sc])er=mr-1;
            else if(target>matrix[mr][ec])sr=mr+1;
            else{
                while(sc<=ec){
                    int mc=sc+(ec-sc)/2;
                    if(target==matrix[mr][mc])return true;
                    else if(target<matrix[mr][mc])ec=mc-1;
                    else sc=mc+1;
                }
                return false;
            }
        }
        return false;
    }
}