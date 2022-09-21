/**
 * This program is intended to illustrate the use of StringTokenizer class.
 * 
 * Question:
 * Write a Java program that reads a line of integers, and then displays each integer, and the 
 * sum of all the integers (Use String Tokenizer class of java.util).
 * 
 * This program is written by Anirudh A V
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Line_of_Integers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line of numbers : ");
        String str = sc.nextLine();

        StringTokenizer num = new StringTokenizer(str, " ");
        while (num.hasMoreTokens()) {
            String s = num.nextToken();
            System.out.println(s);
            sum = sum + Integer.parseInt(s);
        }
        System.out.println("The sum of the list of numbers is "+sum);
        sc.close();
    }
}