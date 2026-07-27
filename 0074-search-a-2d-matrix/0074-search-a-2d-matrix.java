class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int sr=0, er=matrix.length-1;
        while(sr<=er){
            int mr=sr+(er-sr)/2;
            int sc=0, ec=matrix[0].length-1;
            while(sc<=ec){
                int mc=sc+(ec-sc)/2;
                if(matrix[mr][mc]==target)return true;
                else if(matrix[mr][mc]>target){
                    ec=mc-1;
                }else{
                    sc=mc+1;
                }
            }
            if(sc==matrix[mr].length)sc--;
            if(sc==-1)sc=0;
            if(matrix[mr][sc]>target)er=mr-1;
            else sr=mr+1;
        }
        return false;
    }
}