package sort;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InsertionSort{

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
     insertionSort(arr);
        sc.close();
            }
            public static void insertionSort(int arr[]) throws IOException{
                int n = arr.length;
                for (int i = 1; i < n; i++) {
                    int key = arr[i];
                    int j = i - 1;
                    while (j >= 0 && arr[j] > key) {
                        arr[j + 1] = arr[j];
                        j = j - 1;
                    }
                    arr[j + 1] = key;
                }
                FileWriter writerobj=new FileWriter("sample.txt",true);
                writerobj.write("\n\n");
                writerobj.write("The Insertion Sorted elements are : ");
                for(int i=0;i<arr.length;i++){
                    writerobj.write("\n"+arr[i]);
                }
                writerobj.close();
                System.out.println("Message Written successfully !! Check the 'sample.txt' file");
                }
            }
                    
