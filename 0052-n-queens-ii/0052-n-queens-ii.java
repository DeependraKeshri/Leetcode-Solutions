class Solution {
    int count=0;
    public int totalNQueens(int n) {
        char [][] board=new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][i]='X';
            }
        }
        nqueen(board, 0);
        return count;
    }
    public void nqueen(char board[][], int rows){
        if(rows==board.length){
            count++;
            return;
        }
        for(int i=0; i<board.length; i++){
            if(isSafe(board, rows, i)){
                board[rows][i]='Q';
                nqueen(board, rows+1);
                board[rows][i]='X';
            }
        }
    }
    public static boolean isSafe(char board[][], int rows, int col){
        int n=board.length;
         //check from east to west
        for(int i=0; i<n; i++){
            if(board[rows][i]=='Q')return false;
        }
         //check from north to south
        for(int i=0; i<n; i++){
            if(board[i][col]=='Q')return false;
        }
         //check south-east
        int i=rows, j=col;
        while(i<n && j>-1){
            if(board[i][j]=='Q')return false;
            i++;
            j--;
        }
         //check south-west
        i=rows;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q')return false;
            i++;
            j++;
        }
         //check north-west
        i=rows;
        j=col;
        while(i>-1 && j<n){
            if(board[i][j]=='Q')return false;
            i--;
            j++;
        }
         //check north-east
        i=rows;
        j=col;
        while(i>-1 && j>-1){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
        return true;
    }
}