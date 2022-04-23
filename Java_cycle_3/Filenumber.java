import java.io.*;

public class Filenumber {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("code.txt");
            String str = "";
            if (f.ready()) {
                int data = f.read();
                while (data != -1) {
                    str = str + (char) data;
                    data = f.read();
                }
            } else {
                System.err.println("\nFile not Found\n");
            }
            int n = 2;
            System.out.print("1 ");
            // int len = str.length();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '\n') {
                    System.out.print(str.charAt(i));
                    System.out.print(n + " ");
                    n++;
                } else {
                    System.out.print(str.charAt(i));
                }
                f.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
