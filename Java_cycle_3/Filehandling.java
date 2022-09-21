/**
 * This program is intended to illustrate the concepts of file handling in java.
 * 
 * Question:
 * Write a file handling program in Java with reader/writer.
 * 
 * This program is written by Anirudh A V
 */

import java.io.*;
import java.util.Scanner;

public class Filehandling {
    public static void main(String [] args){
        try {
            Writer w = new FileWriter("file.txt");
            Scanner sc = new Scanner(System.in);
            System.out.printf("\nEnter the data : ");
            String content = sc.nextLine();
            w.write(content);
            w.close();
            sc.close();

            Reader r = new FileReader("file.txt");
            if (r.ready()) {
                System.out.println("\nData inside the file : ");
                int character = r.read();
                while (character != -1) {
                    System.out.print((char)character);
                    character = r.read();
                }
                r.close();
            } else {
                System.err.println("\nFile not Found.\n");
            }
        } catch (Exception e) {
            System.err.println(e+" occurred.\n");
        }
    }
    
}