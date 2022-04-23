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
