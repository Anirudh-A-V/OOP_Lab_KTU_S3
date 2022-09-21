/**
 * This program is intended to determine the sum of diagonal elements of a matrix
 * This is written by Anirudh A V
 */

import java.util.Scanner;

public class diagonal_sum {

    public static void print_matrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }

    public static int sum(int[][] matrix, int row, int col) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nEnter the order of the matrix (mxn) : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter the matrix  : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("\nMatrix : ");
        print_matrix(matrix, row, col);
        int sum = sum(matrix,row,col);
        System.out.println("Sum of diagonal elements : "+sum );
    }
}
