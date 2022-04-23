import java.util.*;

public class Doubly {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        Scanner sc = new Scanner(System.in);

        int choice, response = 1;
        do {
            System.out.println("\n\n\tM E N U");
            System.out
                    .println("1. Insert at beginning\n2. Insert at end\n3. Delete the given node\n4. Display\n5. Exit");
            System.out.printf("\n\t->");
            choice = sc.nextInt();
            int data;
            switch (choice) {
                case 1:
                    System.out.printf("Enter the data to be inserted at the front : ");
                    data = sc.nextInt();
                    list.addFirst(data);
                    break;

                case 2:
                    System.out.printf("Enter the data to be inserted at the end : ");
                    data = sc.nextInt();
                    list.addLast(data);
                    break;

                case 3:
                    System.out.printf("Enter the index of the node to be deleted : ");
                    data = sc.nextInt();
                    list.remove(data);
                    break;

                case 4:
                    ListIterator<Integer> iter = list.listIterator(0);
                    System.out.println("List : "+"\n");
                    while (iter.hasNext()) {
                        System.out.printf("%d ", iter.next());
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        } while (response == 1);
        sc.close();
    }
}
