/**
 * This program is intended to test the knowledge on classes and objects in java.
 * 
 * Question:
 * To write a Java program to print the area of a rectangle by creating a class
 * named 'Area' having two methods. The first method named 'setDim' takes
 * the length and breadth of the rectangle as parameters and the second method
 * named 'getArea' returns the area of the rectangle. The length and breadth of
 * a rectangle are entered through the keyboard
 * 
 * This program is written by Anirudh A V
 */

import java.util.Scanner;

public class Area {
    int length;
    int breadth;

    void setDim(int a, int b){
        this.length = a;
        this.breadth = b;
    }

    int getArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the rectangle : ");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int b = sc.nextInt();

        Area ar = new Area();

        ar.setDim(a, b);
        System.out.println("Area is "+ ar.getArea());

        sc.close();
    }
}