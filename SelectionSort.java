package sort;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SelectionSort{

    static Scanner sc2 = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    File file = new File("sample.txt");
    Scanner sc = new Scanner(file);

    int count=0,j=0;
    String temp ="";
    String element=sc.nextLine();

    for(int i=0;i<element.length();i++){
        if(element.charAt(i)==','){
            count++;
        }
    }
    count++;
    int arr[]=new int[count];
    for(int i=0;i<element.length();i++){
        if(element.charAt(i)!=','){
            temp=temp+element.charAt(i);
        }
        else{
            arr[j]=Integer.parseInt(temp);
            temp="";
            j++;
        }
    }
    System.out.print("The Unsorted File elements are : ");
    arr[j]=Integer.parseInt(temp);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
       selectionSort(arr);
        sc.close();
            }
                //SELECTION SORT---------------------------------------------------------------

    public static void selectionSort(int arr[]) throws IOException{
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    FileWriter writerobj=new FileWriter("sample.txt",true);
    writerobj.write("\n\n");
    writerobj.write("The Selection Sorted elements are : ");
    for(int i=0;i<arr.length;i++){
        writerobj.write("\n"+arr[i]);
    }
    writerobj.close();
    System.out.println("Message Written successfully !! Check the 'sample.txt' file");
}
}
