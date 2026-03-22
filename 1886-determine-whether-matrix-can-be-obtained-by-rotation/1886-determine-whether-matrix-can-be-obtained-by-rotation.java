class Solution {
    public void rotate(int mat[][]){
        for(int i=1; i<mat.length; i++){
            for(int j=0; j<i; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length/2; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][mat.length-j-1];
                mat[i][mat.length-j-1]=temp;
            }
        }
    }
    public boolean isSame(int mat[][], int [][] target){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][j]!=target[i][j])return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<=3; i++){
            if(isSame(mat,target))return true;
            rotate(mat);
        }
        return false;
    }
}