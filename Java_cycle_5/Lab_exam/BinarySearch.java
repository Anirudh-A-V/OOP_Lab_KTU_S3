// import java.util.Scanner;

// public class BinarySearch {

// 	int binarySearch(int arr[], int start, int last, int key)
// 	{
// 		if (last >= start) {
// 			int mid = start + (last - start) / 2;

// 			if (arr[mid] == key)
// 				return mid;

// 			else if (arr[mid] > key)
// 				return binarySearch(arr, start, mid - 1, key);
                
//             else
// 		        return binarySearch(arr, mid + 1, last, key);
// 		}
// 		return -1;
// 	}

// 	public static void main(String args[])
// 	{
//         Scanner sc = new Scanner(System.in);
// 		BinarySearch ob = new BinarySearch();

//         System.out.printf("Enter the size of the array : ");
//         int n = sc.nextInt();
// 		int[] arr = new int[n];

//         System.out.println("Enter the array : ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

// 		System.out.printf("Enter the number to search : ");
//         int key = sc.nextInt();

// 		int result = ob.binarySearch(arr, 0, n - 1, key);

// 		if (result == -1)
// 			System.out.println("Element not present");
// 		else
// 			System.out.println("Element found at index " + result);

//         sc.close();
// 	}
// }
