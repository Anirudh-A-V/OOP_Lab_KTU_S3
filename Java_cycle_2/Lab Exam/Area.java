
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

        // int ef = 4;
        // char String =  'i';
        // System.out.print(ef);
        // System.out.print(String);

        // char[] ch = new char[5];

        sc.close();
    }
}