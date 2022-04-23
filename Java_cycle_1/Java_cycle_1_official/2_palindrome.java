/**
 * This program is intended to check whether a string is palindrome or not.
 * This is written by Anirudh A V on 22 Dec 2021
 */

public class palindrome {
  public static void main(String[] args) {
    String str = "malayalam";
    int flag = 0, len = str.length();
    for (int i = 0; i < len; i++) {
      if (str.charAt(i) != str.charAt(len - i - 1)) {
        flag++;
        break;
      }
    }
    System.out.println("");
    if (flag == 0) {
      System.out.println(str + " is a palindrome.");
    } else {
      System.out.println(str + " is not a palindrome.");
    }
  }
}
