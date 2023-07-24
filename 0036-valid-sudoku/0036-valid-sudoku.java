import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[][] squares = new HashSet[3][3];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                squares[i][j] = new HashSet<>();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char cellValue = board[i][j];
                if (cellValue == '.') {
                    continue;
                }
                if (rows[i].contains(cellValue) ||
                    cols[j].contains(cellValue) ||
                    squares[i / 3][j / 3].contains(cellValue)) {
                    return false;
                }
                cols[j].add(cellValue);
                rows[i].add(cellValue);
                squares[i / 3][j / 3].add(cellValue);
            }
        }
        return true;
    }
}