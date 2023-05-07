package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class HeapSort {
    static Scanner sc = new Scanner(System.in);
    static HeapSort hs = new HeapSort();

    // MAIN-METHOD-------------------------------------------------------------
    public static void main(String[] args) {

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = hs.arrayInput(n);
        System.out.println("\n\nThe Unsorted elements are : " + Arrays.toString(arr) 		+ "\n");

        int heapArr[] = hs.heapSort(arr);
        System.out.println("The Heap-Sorted elements are : " + 			  		      Arrays.toString(heapArr) + "\n");

        String Name = System.getProperty("user.name");
        System.out.println("Well Done!! " + Name);

        String timeStamp = new SimpleDateFormat("dd-MM-yyyy HH-mm-		    		      ss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);

    }

    // ARRAY-INPUT------------------------------------------------------------
    public int[] arrayInput(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at position " + (i + 1));
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // HEAP-SORT--------------------------------------------------------------
    public int[] heapSort(int arr[]) {
        int n = arr.length;
        hs.makeHeap(arr);
        System.out.println("MAKE HEAP = " + Arrays.toString(arr) + "\n");
        for (int i = n; i >= 2; i--) {
            int temp = arr[0];
            arr[0] = arr[i - 1];
            arr[i - 1] = temp;
            hs.shiftDown(arr, (i - 1), 1);
        }
        return arr;
    }

    // MAKE-HEAP--------------------------------------------------------------
    public int[] makeHeap(int arr[]) {
        int n = arr.length;
        for (int i = (n / 2); i >= 1; i--) {
            hs.shiftDown(arr, n, i);
        }
        return arr;
    }

    // SHIFT-DOWN-------------------------------------------------------------
    public int[] shiftDown(int arr[], int n, int i) {
        if ((2 * i) <= n) {
            do {
                i = 2 * i;

                if ((i + 1) <= n && arr[(i + 1) - 1] > arr[(i - 1)]) {
                    i = i + 1;
                }
                try {

                    if (arr[(int) Math.floor((i / 2) - 1)] < arr[(i - 1)]) {
                        int temp = arr[(int) Math.floor((i / 2) - 1)];
                        arr[(int) Math.floor((i / 2) - 1)] = arr[(i - 1)];
                        arr[(i - 1)] = temp;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while ((2 * i) <= n);
        }
        return arr;
    }
}
