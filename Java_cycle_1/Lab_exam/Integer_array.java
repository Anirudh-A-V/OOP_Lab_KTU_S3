import java.util.Scanner;

public class Integer_array {
    public static void smallest_largest(int[] array, int n) {
        int temp;
        for(int i = 0; i < n;i++){
            for(int j = i +1; j< n; j++){
                if (array[i]> array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("The smallest number is "+array[0]);
        System.out.println("The largest number is "+array[n-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nEnter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] array = new int[30];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("\nThe elements of array : ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
        smallest_largest(array, n);
    }
}
