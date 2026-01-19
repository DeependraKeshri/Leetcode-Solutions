class Solution { 
    public int[] findDiagonalOrder(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int n = r * c;
        int arr[] = new int[n];
        int j = 0, k = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = mat[j][k];  

            if ((j + k) % 2 == 0) {  
                if (k == c - 1) {        
                    j++;
                } else if (j == 0) {     
                    k++;
                } else {                 
                    j--;
                    k++;
                }
            } else {                
                if (j == r - 1) {        
                    k++;
                } else if (k == 0) {     
                    j++;
                } else {                
                    j++;
                    k--;
                }
            }
        }
        return arr;
    }
}
