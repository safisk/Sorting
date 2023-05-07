package sort;
import java.util.Scanner;
public class ModifiedLinearSearch {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the no. of Elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n],i=0;
        while(i<arr.length){
            System.out.print("Enter the value ");
            int temp=sc.nextInt();
            if(i==0){
                arr[i]=temp;
                i++;
            }
            else if(i>0){
                if(arr[i-1]<=temp){
                    arr[i]=temp;
                    i++;
                }
                else
                    System.out.println("Please Enter value at Sorted order"); 
            }    
        }
        System.out.print("The Elements are : ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.print("Enter the key to find : ");
        int key=sc.nextInt();
        sequentialLinear(arr,key);        
    }
    public static void sequentialLinear(int arr[],int key){
        int i=0,flag=0;
        while(arr[i]<=key && i<arr.length){
            if(arr[i]==key){
                flag=1;
                break;
            }
            i++;  
        }
        if(flag==1)
            System.out.println("The Key "+key+" found at position "+(i+1));
        else
            System.out.println("Sorry!! The Key not found");
    }
}
