/**
 * This program is intended to test the knowledge on the concept of inheritance in java.
 * 
 * Question:
 * To create a class named 'Rectangle' with two data members 'length' and
 * 'breadth' and two methods to print the area and perimeter of the rectangle
 * respectively. Its constructor having parameters length and breadth is used to
 * initialize the length and breadth of the rectangle. Let class 'Square' inherit
 * the 'Rectangle' class with its constructor having a parameter for its
 * side(suppose s) calling the constructor of its parent class as 'super(s,s)'. Print
 * the area and perimeter of a rectangle and a square.
 * 
 * This program is written by Anirudh A V
 */

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int a, int b) {
        length = a;
        breadth = b;
    }

    void area() {
        System.out.println("Area is " + length * breadth);
    }

    void perimeter() {
        System.out.println("Perimeter is " + 2 * (length + breadth));
    }

}

class Square extends Rectangle{
    public Square(int s){
        super(s, s);
    }
}
public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of rectangle : ");
        int b = sc.nextInt();

        Rectangle rc = new Rectangle(a, b);
        rc.area();
        rc.perimeter();
        System.out.println("\nEnter the side of square : ");
        int s = sc.nextInt();
        Square sq = new Square(s);
        sq.area();
        sq.perimeter();
        sc.close();
    }
}
