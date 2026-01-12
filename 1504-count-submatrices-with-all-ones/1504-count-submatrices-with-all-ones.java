class Solution {
    public int numSubmat(int[][] mat) {
        int count=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==0) continue;

                int minWidth=Integer.MAX_VALUE;
                int d=i;

                while(d<mat.length && mat[d][j]!=0){
                    int rt=j;
                    int width=0;

                    while(rt<mat[i].length && mat[d][rt]!=0){
                        width++;
                        rt++;
                    }

                    minWidth=Math.min(minWidth,width);
                    count+=minWidth;
                    d++;
                }
            }
        }
        return count;
    }
}
