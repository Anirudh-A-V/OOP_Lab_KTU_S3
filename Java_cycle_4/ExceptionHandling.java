/**
 * This program is for familarizing with the concept of Exception Handling.
 * 
 * Question:
 * Write a Java program that shows the usage of try, catch, throws and finally.
 * 
 * This program is written by Anirudh A V
 */

public class ExceptionHandling {
    public static void main(String[] args) throws ArithmeticException {
        try {
            int a = 0;
            int b = 6;
            int $i = 0;
            System.out.println(b / a);
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            System.out.println("Excecution Completed!!!");
            // System.out.println();
        }

        

    }
}