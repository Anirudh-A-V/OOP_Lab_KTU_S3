/**
 * This program is intended to familiarise the concept of user defined exception.
 * 
 * Question:
 * Write a Java program that shows how to create a user-defined exception
 * 
 * This program is written by Anirudh A V
 */

class InvalidAgeException extends Exception {

  InvalidAgeException(String str) {
    super(str);
  }
}

public class UserException {

  public static void validate(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException("Age below minimum age for voting");
    } else {
      System.out.println("Please cast your vote");
    }
  }

  public static void main(String[] args) {
    try {
      validate(13);
    } catch (Exception e) {
      System.out.println("Caught the exception");
      System.out.println("Exception occured : " + e);
    }
  }
}
