/**
 * This program is intended to find the second smallest element 
 * in an array.
 * This is written by Anirudh A V on 22 Dec 2021
 */

public class Second{
  public static void main(String[] args){
    int[] array = {12, 23, 1, 56, 789, 24};
    int len = 6, temp;
    for (int i = 0;i < len ;i++ ) {
      for (int j= i+1;j<len ;j++ ) {
        if (array[i]>array[j]) {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    System.out.println("\nThe second smallest element is "+ array[1]);
  }
}
