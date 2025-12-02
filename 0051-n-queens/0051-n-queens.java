class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        nqueen(board, 0, ans);
        return ans;
    }
    public void nqueen(char board[][], int rows, List<List<String>> ans){
        if(rows==board.length){
            List<String> list=new ArrayList<>();
            for(int i=0; i<board.length; i++){
                String s="";
                for(int j=0; j<board[i].length; j++){
                    s+=board[i][j];
                }
                list.add(s);
            }
            ans.add(list);
            return;
        }
        for(int i=0; i<board.length; i++){
            if(isSafe(board, rows, i)){
                board[rows][i]='Q';
                nqueen(board,rows+1, ans);
                board[rows][i]='.';
            }
        }
    }
    public boolean isSafe(char board[][], int rows, int col){
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