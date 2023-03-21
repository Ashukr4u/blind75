package com.kishore.anant.misc.matrix;

public class MaximalSquare {

    public static void main(String[] args) {
        /*char[][] matrix = new char[][]{
                        {'1','0','1','0','0'},
                        {'1','0','1','1','1'},
                        {'1','1','1','1','1'},
                        {'1','0','0','1','0'}};*/
        char[][] matrix = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'0', '0', '1', '1', '1'}};
        MaximalSquare maximalSquare = new MaximalSquare();
        int result = maximalSquare.maximalSquare(matrix);
        System.out.println(result);
    }

    public int maximalSquare(char[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] squareMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                squareMatrix[i][j] = matrix[i][j] - 48;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (squareMatrix[i][j] == 1) {
                    if (i > 0 && j > 0) {
                        squareMatrix[i][j] = min(squareMatrix[i - 1][j], squareMatrix[i][j - 1], squareMatrix[i - 1][j - 1]) + 1;
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(squareMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int max_so_far = squareMatrix[0][0];
        int max_i = 0;
        int max_j = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (squareMatrix[i][j] > max_so_far) {
                    max_so_far = squareMatrix[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        return max_so_far * max_so_far;
    }

    private int min(int matrix1, int matrix2, int matrix3) {
        return ((matrix1 > matrix3) ? ((matrix3 > matrix2) ? matrix2 : matrix3) : ((matrix1 > matrix2) ? matrix2 : matrix1));
    }
}
