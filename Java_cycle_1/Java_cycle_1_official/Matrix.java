/**
 * This program is intended to mulltiply two matrices and
 * Display their product.
 * This is written by Anirudh A V on 22 Dec 2021
 */

public class Matrix{

  public static void display(int[][] matrix, int row, int col){
    for (int i = 0;i < row ;i++ ) {
      for (int j = 0;j < col ;j++ ) {
        System.out.printf(matrix[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public static void main(String[] args){
    int[][] matrixA = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] matrixB = {{1,0,0},{0,1,0},{0,0,1}};
    int[][] mult = new int[3][3];

    for (int i = 0;i < 3 ;i++ ) {
      for (int j = 0;j < 3 ;j++ ) {
        mult[i][j] = 0;
        for (int k = 0;k < 3 ;k++ ) {
          mult[i][j] = mult[i][j] + matrixA[i][k]*matrixB[k][j];
        }
      }
    }
    System.out.println("Matrix A : ");
    display(matrixA, 3, 3);
    System.out.println("Matrix B : ");
    display(matrixB, 3, 3);
    System.out.println("Product : ");
    display(mult, 3, 3);
  }
}
