package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-03-22
 */
public class PathInMatrix {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0] == null || board[0].length == 0) {
            return false;
        }
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (search(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, int i, int j, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '#' ||
                board[i][j] != word.charAt(index)) {
            return false;
        }
        char ch = board[i][j];
        board[i][j] = '#';
        boolean result = (search(board, i - 1, j, word, index + 1) ||
                          search(board, i + 1, j, word, index + 1) ||
                          search(board, i, j - 1, word, index + 1) ||
                          search(board, i, j + 1, word, index + 1));
        board[i][j] = ch;
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println(new PathInMatrix().exist(board, word));
    }
}
