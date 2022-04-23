/**
 * Line_of_Integers
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