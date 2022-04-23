/**
 * This program is intended to detremine the occurence or frequency of a
 * character in a given sentence.
 * This is written by Anirudh A V on 22 Dec 2021
 */

public class Frequency {
  public static void main(String[] args) {
    String str = "Hello, I am Baymax. It is a pleasure to meet you";
    char key = 'a';
    int len = str.length(), count = 0;
    for (int i = 0; i < len; i++) {
      if (str.charAt(i) == key) {
        count++;
      }
    }
    System.out.println("\n'" + key + "' occurs " + count + " times in '" + str + "'.");
  }
}
