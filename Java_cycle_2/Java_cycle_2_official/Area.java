/**
 * This program is intended to calculate the are of different shapes 
 * using method overloading.
 * 
 * Question:
 * Write a Java program to calculate the area of different shapes namely circle, rectangle, 
 * and triangle using the concept of method overloading.
 * 
 * This program is written by Anirudh A V on Jan 25 2022.
 */

import java.util.Scanner;

public class Area {

    static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    static double area(double length, double breadth) {
        return length * breadth;
    }

    static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double x = s * (s - a) * (s - b) * (s - c);
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int response = 1, choice;
        double radius, a, b, c, length, breadth;
        do {
            System.out.println("\t\nM E N U");
            System.out.println("1. Rectangle\n2. Circle\n3. Triangle\n4. Exit");
            System.out.printf("\n\t->");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the length and breadth : ");
                    length = sc.nextDouble();
                    breadth = sc.nextDouble();
                    System.out.println("Area : " + area(length, breadth)+" Sq. unit");
                    break;

                case 2:
                    System.out.println("Enter the radius : ");
                    radius = sc.nextDouble();
                    System.out.println("Area : " + area(radius)+" Sq. unit");
                    break;

                case 3:
                    System.out.println("Enter the sides a, b, c of the triangle : ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    System.out.println("Area : " + area(a, b, c)+" Sq. unit");
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        } while (response == 1);
        sc.close();
    }
}