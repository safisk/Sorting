package sort;
import java.util.Scanner;
public class QuickSorting {

    static Scanner sc=new Scanner(System.in);
    int partition(int arr[], int start, int end) {
        int pivot = arr[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++; // increment index of smaller element
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = t;
        return (i + 1);
    }

    /* function to implement quick sort */
    void quick(int arr[], int start, int end) /* a[] = array to be sorted, start = 								Starting index, end = Ending index */
    {
        if (start < end) {
            int p = partition(arr, start, end); // p is partitioning index
            quick(arr, start, p - 1);
            quick(arr, p + 1, end);
        }
    }

    void printArr(int arr[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        System.out.print("Enter the total number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value at position " + (i + 1) + " : ");
            int data = sc.nextInt();
            arr[i] = data;
        }
        QuickSorting obj = new QuickSorting();
        System.out.print("Before sorting array elements are : ");
        obj.printArr(arr, n);
        obj.quick(arr, 0, n - 1);
        System.out.print("\nAfter sorting array elements are : ");
        obj.printArr(arr, n);
        System.out.println();
    }
}

