package sort;
import java.util.Scanner;
public class BinarySearchRecursive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of Elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("----NOTE : Enter the elements in sorted order----");
        System.out.print("Enter value at position 1 : ");
        arr[0]=sc.nextInt();
        for(int i=1;i<arr.length;i++){
            System.out.print("Enter value at position "+(i+1)+" : ");
            int data=sc.nextInt();
            if(arr[i-1]<data)
                arr[i]=data;
            else{
                System.out.println("Please!! Enter the elements in sorted order");
                i--;
            }
        }
        System.out.print("The Elements are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the key to be Search : ");
        int key=sc.nextInt();
        int msg=binarySearchRec(arr, 0, 0, n-1,key);
        if(msg==0)
            System.out.println("The key "+key+" not found");
        else
            System.out.println("The key "+key+" found at position : "+(msg));
        sc.close();
    }
    public static int binarySearchRec(int arr[],int first,int mid,int last,int 		   key){
        if(first<=last){
            mid=(first+last)/2;

            if(arr[mid]==key){
                return (mid+1);
            }
            else if(key<arr[mid]){
                return binarySearchRec(arr, first, mid, mid-1, key);
            }
            else{
                return binarySearchRec(arr, mid+1, mid, last, key);
            }
        }
        else{
            return 0;
        }
    }
}

