import java.io.*;
import java.util.*;
public class Mergesort{
 void merge(int arr[], int low, int mid, int high)
 {
 int n1 = mid - low + 1;
 int n2 = high - mid;
 int L[] = new int[n1];
 int R[] = new int[n2];
 for (int i = 0; i < n1; ++i)
 L[i] = arr[low + i];
 for (int j = 0; j < n2; ++j)
 R[j] = arr[mid + 1 + j];
 int i = 0, j = 0;
 int k = low;
 while (i < n1 && j < n2) {
 if (L[i] <= R[j]) {
 arr[k] = L[i];
 i++;
 }
else {
 arr[k] = R[j];
 j++;
 }
 k++;
 }
 while (i < n1) {
 arr[k] = L[i];
 i++;
 k++;
 }
 while (j < n2) {
 arr[k] = R[j];
 j++;
 k++;
 }
 }
 void mergeSort(int arr[], int low, int high)
 {
 if (low < high) {
 int mid = low + (high - low) / 2;
 
mergeSort(arr, low, mid);
 mergeSort(arr, mid + 1, high);
 
merge(arr, low, mid, high);
 }
 }
 public static void main(String args[])
 {
 try
 {
 //READ FROM A FILE
File file = new File(args[0]);
 Scanner sc = new Scanner(file);
 String fileContent = "";
 while(sc.hasNextLine()){
 System.out.println("The unsorted Array :" + fileContent);
 }
 sc.close();
 
 //STRING TO INTEGER
 //String [] sar;
 fileContent = fileContent.replace("," , " ");
 String str[] = fileContent.split(" ");
 int size = str.length;
 int arr[] = new int[size];
 for (int i=0; i<size ; i++){
 arr[i]= Integer.parseInt(str[i]);
 }
 //MERGE SORT CALL
 Mergesort obj = new Mergesort();
 obj.mergeSort(arr, 0, arr.length - 1);
 
 //WRITE ON A FILE
 FileWriter Writer = new FileWriter(args[0],true);
 Writer.write("\n");
 Writer.write("Sorted array : ");
 for(int i=0; i<size; i++){
 Writer.write(arr[i]+" ");
 }
 Writer.close();
 System.out.println("Successfully written.");
 
 }catch(IOException err){
 System.out.println(err.getMessage());
 }
 }
}