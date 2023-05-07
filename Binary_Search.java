package sort;
import java.io.*;
import java.util.*;
public class Binary_Search {
    //BINARY SEARCH METHOD
int binarySearch(int arr[], int low, int high, int searchItem){
    if(low <= high){
    int mid = (low + high)/2;
    if(arr[mid] == searchItem)
    return mid;
    else if(arr[mid] < searchItem)
    return binarySearch(arr, mid+1, high, searchItem);
    else
    return binarySearch(arr, low, mid-1, searchItem);
    }
    return -1;
    }
    
   public static void main(String args[]){
    try (Scanner scr = new Scanner(System.in)) {
        System.out.println("Enter search item: ");
        int searchItem = scr.nextInt();
        
   try{
        File fl = new File("Element.txt");
        Scanner sc = new Scanner(fl);
        String fileContent = "";
        
   //Read data from file
   while(sc.hasNextLine()){
        fileContent = sc.nextLine();
        }
        sc.close();
        
        //Store in array
   fileContent = fileContent.replace("," , " ");
        String str[] = fileContent.split(" ");
        int size = str.length;
        int arr[] = new int[size];
        for (int i=0; i<size ; i++){
        arr[i]= Integer.parseInt(str[i]);
        }
        
   Binary_Search bs = new Binary_Search();
        int pos = bs.binarySearch(arr, 0, arr.length-1, searchItem);
        if(pos >= 0)
        System.out.println("Item Found at: "+ (pos+1) +"th position"
   );
        else
        System.out.println("Item not Found.");
        }catch(IOException err){
        System.out.println(err);
        }
    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    }
    
}
