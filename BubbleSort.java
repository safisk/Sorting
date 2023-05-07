package sort;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BubbleSort{

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
    bubbleSort(arr);
        sc.close();
            }
//BUBBLE SORT------------------------------------------------------------------

public static void bubbleSort(int arr[]) throws IOException{
    int temp=0;
    for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length-i;j++){
            if(arr[j-1]>arr[j]){
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.print("The Bubble Sorted elements are : ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
FileWriter writerobj=new FileWriter("sample.txt",true);
   writerobj.write(" ");
writerobj.write("The Bubble Sorted elements are : ");
for(int i=0;i<arr.length;i++){
    writerobj.write("\n"+arr[i]);
}
writerobj.close();
System.out.println();
System.out.println("Message Written successfully !! Check the 'sample.txt' file");
}
}