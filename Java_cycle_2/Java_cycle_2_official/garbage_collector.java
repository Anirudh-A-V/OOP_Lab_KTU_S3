/**
 * This program is intended to demonstrate the concept of garbage collection.
 * 
 * Question:
 * Write a Java program to demonstrate the use of garbage collection.
 * 
 * This program is written by Anirudh A V on Jan 25 2022.
 */

public class garbage_collector {
    // This function is executed whenever garbage collection happens. It has to
    // be declared public so that it can be called outside the class
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector has run");
    }

    public static void main(String args[]) {
        garbage_collector gb = new garbage_collector();
        gb = null;
        // Calling garbage collector
        System.gc();
    }
}