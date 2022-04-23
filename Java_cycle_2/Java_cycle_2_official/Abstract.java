/**
 * This program is intended to understand the concept of polymorphism in java.
 * This program is written by Anirudh A V on Jan 25 2022.
 */

abstract class Shape {
    abstract void numberOfSides();
}

class Rectangles extends Shape {
    void numberOfSides() {
        System.out.println("The number of sides of a rectangle is 4");
    }
}

class Triangles extends Shape {
    void numberOfSides() {
        System.out.println("The number of sides of a triangle is 3");
    }
}

class Hexagons extends Shape {
    void numberOfSides() {
        System.out.println("The number of sides of a hexagon is 6");
    }
}



public class Abstract {
    public static void main(String args[]) {
        Rectangles rt = new Rectangles();
        Triangles tr = new Triangles();
        Hexagons hx = new Hexagons();
        rt.numberOfSides();
        tr.numberOfSides();
        hx.numberOfSides();
    }
}