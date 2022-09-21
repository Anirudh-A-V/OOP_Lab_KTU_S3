/**
 * This program is intended to implement the quick sort algorithm in java.
 * 
 * Question:
 * Write a Java program that implements Quick Sort algorithm for sorting a list of names in 
 * ascending order
 * 
 * This program is written by Anirudh A V
 */

import java.util.Scanner;

class Sort{
    int arr[], n;
    Sort(int arr[], int n){

        this.arr = arr;
        this.n = n;
    }

    void sort_now(int arr[], int st, int end)
    {
        int pivot = st, i=st+1, j=end, temp;
        if(st >= end)
        return;
        try{
            do{
                if(arr[i]>arr[pivot]){
                    // j=end;
                    do{
                        if(arr[pivot]>arr[j]){
                            temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                            break;        
                        }
                        j-=1;
                    }while(i<=j);
            
                }
                i+=1;
            }while(i<=j);
        }catch(Exception e){
            return;
        }
        temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        
        sort_now(arr, j+1, end);
        sort_now(arr, st, j-1);
    }
}

public class QuickSort {
    public static void main(String args[]){
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
        Sort st = new Sort(arr, n);
        for(int p=0; p<n; p++)
        {
            System.out.printf("%d ", arr[p]);
        }
        System.out.println();
        st.sort_now(arr, 0, n-1);
        System.out.print("\nThe sorted array is shown below:\n\n");
        for(int i=0; i<n; i++)
        {
            System.out.printf("%d ", arr[i]);
        }

    }
}

