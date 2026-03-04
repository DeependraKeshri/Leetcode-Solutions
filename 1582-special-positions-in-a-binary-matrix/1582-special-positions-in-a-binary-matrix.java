class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==1){
                Boolean check=true;
                for(int k=0; k<mat[i].length; k++){
                    if(k==j)continue;
                    if(mat[i][k]==1){
                        check=false;
                        break;
                    }
                }
                if(check){
                    for(int k=0; k<mat.length; k++){
                        if(i==k)continue;
                        if(mat[k][j]==1){
                            check=false;
                            break;
                        }
                    }
                }
                if(check)count++;
                }
            }
        }
        return count;
    }
}