/**
 * This program is intended to demonstrate the concept of interface inheritance.
 * This program is written by Anirudh A V on Jan 25 2022.
 */

interface ShapeName {
    public void name();
}

interface ShapeInfo extends ShapeName {
    public void info();
}

class Triangle implements ShapeInfo {
    // Note: If the interface class is public, then this implementation should also
    // be public
    public void name() {
        System.out.println("\nInside Triangle");
    }

    public void info() {
        System.out.println("A triangle has 3 sides\n");
    }
}

public class InterfaceInheritance {
    public static void main(String args[]) {
        Triangle tri = new Triangle();
        tri.name();
        tri.info();
    }
}
