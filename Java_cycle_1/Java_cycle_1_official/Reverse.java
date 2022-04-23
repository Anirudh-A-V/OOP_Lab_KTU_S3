/**
 * This program is intended to reverse a given string.
 * This is written by Anirudh A V on 22 Dec 2021
 */

public class Reverse{
  public static void main(String[] args){
    String str = "Ananthapadmanapan";
    int len = str.length(),i =0;
    char[] rev = new char[len+1];

    for (i = 0;i < len ;i++ ) {
      rev[i] = str.charAt(len-1-i);
    }
    rev[len] ='\0';
    System.out.printf("\nThe reversed string : ");
    System.out.println(rev);
  }
}
