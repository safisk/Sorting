package sort;
import java.util.Scanner;
public class MergeSorting {
    static Scanner sc=new Scanner(System.in);
    void merge(int arr[], int beg, int mid, int end) {
        
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for (int i = 0; i < n1; i++){
            LeftArray[i] = arr[beg + i];
        }

        for (int j = 0; j < n2; j++){
            RightArray[j] = arr[mid + 1 + j];
        }
        
        int i=0, j=0, k=beg;
        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void mergeSort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    void printArray(int arr[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String args[]) {
        System.out.print("Enter the total number of elements : ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter value at position "+(i+1)+" : ");
            int data=sc.nextInt();
            arr[i]=data;
        }
        MergeSorting obj = new MergeSorting();
        System.out.print("Before sorting array elements are : ");
        obj.printArray(arr, n);
        obj.mergeSort(arr, 0, n - 1);
        System.out.print("\nAfter sorting array elements are : ");
        obj.printArray(arr, n);
    }
}

