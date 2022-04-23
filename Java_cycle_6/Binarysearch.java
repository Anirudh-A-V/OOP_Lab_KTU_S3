import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Binarysearch{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("\nPlease enter an array in sorted fashion.\n");
        while(true)
        {
            System.out.print("\nPlease enter the integer - ");

            x= sc.nextInt();
            arr.add(x);
            System.out.printf("\nDo you want to add more integers ? (1/0) ");
            x = sc.nextInt();
            if(x == 0)
            break;
        }
        Iterator<Integer> itr = arr.iterator();
        System.out.printf("\nPrinting the array - ");        
        while(itr.hasNext())
        {
            x = itr.next();
            System.out.printf(x + " ");

        }

        System.out.printf("\nPlease enter the element you want to search - ");
        x = sc.nextInt();
        sc.close();

       // Performing binary search
        int start = 0, end = arr.size()-1, mid  = (start + end)/2, flag = 0;
        while(end >= start)
        {
            if(x > arr.get(mid))
            {
                start = mid +1;
                mid = (start + end)/2;
            }else if(x < arr.get(mid))
            {
                end = mid - 1;
                mid = (start + end)/2;

            }else{
                flag =  1;
                break;
            }
        }

        if(flag == 1)
        {
            System.out.println("\nThe element was found at position " + mid+1);
        }
        else
        System.out.println("\nThe element was not found in the array");
        
    }
}
