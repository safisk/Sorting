package sort;
import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args) {
        System.out.print("Enter the total of input elements : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("----Note : Enter the Elements in sorted order----");
        System.out.print("Enter value at position 1 : ");
        arr[0]=sc.nextInt();
        for(int i=1;i<arr.length;i++){
            System.out.print("Enter value at position "+(i+1)+" : ");
            int data=sc.nextInt();
            if(arr[i-1]<data)
                arr[i]=data;
            else{
                System.out.println("Please!! Enter the Elements in sorted order");
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
        int first=0,mid,last=n-1,flag=0;
        for(int i=0;i<arr.length;i++){
            if(first<=last){
                mid=(first+last)/2;
                if(arr[mid]==key){
                    System.out.println("The key "+key+" found at position : 													"+(mid+1));
                    flag=1;
                    break;
                }
                else if(key<arr[mid]){
                    last=mid-1;
                }
                else if(key>arr[mid]){
                    first=mid+1;
                }
            }
        }
        if(flag==0){
            System.out.println("The key "+key+" not found");
        }
        sc.close();
    }

}
