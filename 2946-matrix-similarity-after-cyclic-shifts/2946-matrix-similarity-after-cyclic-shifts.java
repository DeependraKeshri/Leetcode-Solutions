class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length, n=mat[0].length;
        int temp[][]=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                temp[i][j]=mat[i][j];
            }
        }

        k%=n;

        for(int i=0; i<m; i++){
            if(i%2==0){
                for(int t=0; t<k; t++){
                    int tem=temp[i][0];
                    for(int l=0; l<n-1; l++){
                        temp[i][l]=temp[i][l+1];
                    }
                    temp[i][n-1]=tem;
                }
            }else{
                for(int t=0; t<k; t++){
                    int tem=temp[i][n-1];
                    for(int l=n-1; l>=1; l--){
                        temp[i][l]=temp[i][l-1];
                    }
                    temp[i][0]=tem;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]!=temp[i][j])return false;
            }
        }
        return true;
    }
}