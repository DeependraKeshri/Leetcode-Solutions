class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!checkRow(board, i) || !checkCol(board, i)) return false;
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkMat(board, i, j)) return false;
            }
        }

        return true;
    }

    public boolean checkRow(char[][] board, int i) {
        HashSet<Character> set = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            if (board[i][j] == '.') continue;
            if (set.contains(board[i][j])) return false;
            set.add(board[i][j]);
        }
        return true;
    }

    public boolean checkCol(char[][] board, int j) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (board[i][j] == '.') continue;
            if (set.contains(board[i][j])) return false;
            set.add(board[i][j]);
        }
        return true;
    }

    public boolean checkMat(char[][] board, int i, int j) {
        HashSet<Character> set = new HashSet<>();
        for (int l = i; l < i + 3; l++) {
            for (int m = j; m < j + 3; m++) {
                if (board[l][m] == '.') continue;
                if (set.contains(board[l][m])) return false;
                set.add(board[l][m]);
            }
        }
        return true;
    }
}
