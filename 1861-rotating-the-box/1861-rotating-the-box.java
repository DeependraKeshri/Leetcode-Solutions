class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;
        for (int i = 0; i < n; i++) {
            int empty = m - 1;

            for (int j = m - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    empty = j - 1;
                } else if (box[i][j] == '#') {
                    char temp = box[i][empty];
                    box[i][empty] = '#';
                    box[i][j] = temp;
                    empty--;
                }
            }
        }
        char[][] answer = new char[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[j][n - 1 - i] = box[i][j];
            }
        }
        return answer;
    }
}