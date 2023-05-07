package sort;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class LinearSearchFile
{
public static void main(String[] args) throws Exception
{
    File file = new File("sample.txt");
    Scanner element_reader = new Scanner(file),sc = new Scanner(System.in);

    int count=0,j=0,flag=0;
    String temp ="",msg="";
    String element=element_reader.nextLine();

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
    arr[j]=Integer.parseInt(temp);

    System.out.print("The elements of File are : ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.print("Enter the key to be Search : ");
    int key=sc.nextInt();

    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            msg="The key "+key+" found at position : "+(i+1);
            flag=1;
            break;
        }
    }
    if(flag==0)
        msg="The key "+key+" not found";
    FileWriter writerobj=new FileWriter("sample.txt",true);
    writerobj.write("\n"+msg);
    writerobj.close();

    System.out.println("Searching successfully !! Check the Element file");
    sc.close();
    element_reader.close();
}
}