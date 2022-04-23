import java.util.*;

// In heap sort, we first will heapify the entire array. We will start from the bottom most parent (n/2 - 1) and move upwards across all parents. 
// (This is only when we heapify the tree for the first time).
// Then we will obtain the largest element in the entire array. We will swap this element to the last position and will decrease the array size
// by 1. Then we will heapify the tree again (note this time the new root will be pushed along the largest element branches of the tree).

public class HeapSort {
    

    static void heapify(int arr[], int n, int i){
        
        int largest = i, lc = 2*i+1, rc = 2*i+2;

        if(lc<n && arr[lc] > arr[largest]){
            largest = lc;
        }

        if(rc<n && arr[rc] > arr[largest]){
            largest = rc;
        }

        // Moving across the largest path if it exists
        if(i != largest){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, n, largest);
        }
        return;        
    }

    static void Heapsort(int arr[], int n){
        
        // Initially heapify the tree. For this we start from the bottom most parent (n/2 - 1)
        for(int i= n/2 - 1; i>=0; i--){
            heapify(arr, n, i);
        }
        

        // Due to heapify the largest elment is already at the top. So we're going to push it out.
        int temp;

        // Now we extract the largest elements from the heap tree in an iterative way.
        for(int i=n-1; i>0; i--)
        {
    
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // for(int x=0; x<n; x++){
            //     System.out.printf("%d ", arr[x]);
            // }
            System.out.println();
            heapify(arr, i, 0);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the number of elements in the array - ");
        int n = sc.nextInt(), x, arr[] = new int[n];
        
        System.out.print("\nPlease enter an array below.\n");

        for(int i=0; i<n; i++)
        {
            System.out.print("\nPlease enter the integer - ");
            x= sc.nextInt();
            arr[i] = x;
        }

        sc.close();        
        Heapsort(arr, n);

        System.out.println("\nThe sorted array is shown below:");

        // Printing the Sorted array
        for(int i=0; i<n; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}

