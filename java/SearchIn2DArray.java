package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-03-05
 */
public class SearchIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        while (row < m && col >= 0) {
            int value = matrix[row][col];
            if (target > value) {
                row += 1;
            } else if (target < value) {
                col -= 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        //int target = 5;
        int target = 20;
        System.out.println(new SearchIn2DArray().findNumberIn2DArray(matrix, target));
    }
}
