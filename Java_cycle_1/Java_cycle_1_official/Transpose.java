/**
 * This program is intended to find the transpose of a given matrix.
 * This is written by Anirudh A V on 22 Dec 2021
 */

public class Transpose{

  public static void display(int[][] matrix, int row, int col){
    for (int i = 0;i < row ;i++ ) {
      for (int j = 0;j < col ;j++ ) {
        System.out.printf(matrix[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public static void main(String[] args){
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println("\nMatrix : ");
    display(matrix, 3, 3);
    System.out.println("\nTranspose : ");
    for (int i = 0;i < 3 ;i++ ) {
      for (int j = 0;j < 3 ;j++ ) {
        System.out.printf(matrix[j][i] + " ");
      }
      System.out.println("");
    }
  }
}
