/**
 * This program is intended to test the knowledge on try-catch block in java.
 * 
 * Question:
 * To write a Java program to illustrate the use of multiple catch blocks.
 * 
 * This program is written by Anirudh A V
 */

public class MultipleCatchBlock4 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}