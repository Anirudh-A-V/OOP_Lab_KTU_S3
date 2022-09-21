/**
 * This program is intended to illustrate the I/O Exception handling.
 * 
 * Question:
 * Write a Java program that read from a file and write to file by handling all 
 * file related exceptions.
 * 
 * This program is written by Anirudh A V
 */

import java.io.*;
import java.util.Scanner;

public class readnwrite {

    public static void main(String[] args) {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
