class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int sr=0, er=matrix.length-1, sc=0, ec=matrix[0].length-1;
        while(sr<=er){
            int mr=(er+sr)/2;
            if(matrix[mr][sc]<=target && matrix[mr][ec]>=target){
                while(sc<=ec){
                    int mc=(sc+ec)/2;
                    if(matrix[mr][mc]==target)return true;
                    else if(matrix[mr][mc]<target){
                        sc=mc+1;
                    }else{
                        ec=mc-1;
                    }
                }
                break;
            }else if(matrix[mr][sc]<target){
                sr=mr+1;
            }else{
                er=mr-1;
            }
        }
        return false;
    }
}