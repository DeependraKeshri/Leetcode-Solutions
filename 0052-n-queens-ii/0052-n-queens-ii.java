class Solution {
    int count=0;
    public int totalNQueens(int n) {
        char [][] board=new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        nqueen(board, 0);
        return count;
    }
    public void nqueen(char [][] board, int row){
        int n=board.length;
        if(row==n){
            count++;
            return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nqueen(board, row+1);
                board[row][j]='.';
            }
        }
    }
    public boolean isSafe(char [][] board, int row, int col){
        int n=board.length;
        for(int i=0; i<n; i++){
            if(board[row][i]=='Q')return false;
        }
        for(int i=0; i<n; i++){
            if(board[i][col]=='Q')return false;
        }
        int i=row, j=col;
        while(i>-1 && j>-1){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(i>-1 && j<n){
            if(board[i][j]=='Q')return false;
            i--;
            j++;
        }
        i=row;
        j=col;
        while(i<n && j>-1){
            if(board[i][j]=='Q')return false;
            i++;
            j--;
        }
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q')return false;
            i++;
            j++;
        }
        return true;
    }
}