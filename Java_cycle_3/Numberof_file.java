import java.io.*;

public class Numberof_file {
    public static void main(String [] args){
        try {
            FileReader f = new FileReader("file.txt");
            String str = "";
            if (f.ready()) {
                int data = f.read();
                while (data !=-1) {
                    str = str + (char)data;
                    data = f.read ();
                }
            } else {
                System.err.println("\nFile not Found\n");
            }
            f.close();
            int new_line_count = 0, len = str.length(), no_of_words = 0, no_of_lines = 0;;
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == '\n') {
                    new_line_count++;
                    no_of_lines++;
                }
                if ((str.charAt(i) == '\n' || str.charAt(i)==' ') && str.charAt(i-1) != ' ' && str.charAt(i-1) != '\n') {
                    no_of_words++;
                }
            }
            System.out.printf("No. of characters : %d\nNo. of words : %d\nNo. of lines : %d", len-new_line_count, no_of_words+1, no_of_lines+1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
