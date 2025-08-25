class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        /*int n=mat.length*mata[0].length;
       int arr[] = new int[n];
       int j=0, k=0;
       for(int i=0; i<n; i++){
        if(j%2==0 && k%2==0){
            while(j==0 && k==0){
                arr[i]=mat[j][k];
                if(i){
                }else{
                    j--;
                    k++;
                }
            }
        }
       }
       return arr;*/


       if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];

            if ((row + col) % 2 == 0) {
                if (col == n - 1) row++;
                else if (row == 0) col++;
                else { row--; col++; }
            } else {
                if (row == m - 1) col++;
                else if (col == 0) row++;
                else { row++; col--; }
            }
        }

        return result;
    }
}