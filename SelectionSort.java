import java.util.Scanner;  
public class SelectionSort {
  
   public static void main(String args[])  
   {  
       int size, i, j, temp;  
       int arr[] = new int[5000];  
       Scanner scan = new Scanner(System.in);  
         
       System.out.print("Enter Array Size : ");  
       size = scan.nextInt();  
       scan.close();
       System.out.print("Enter Array Elements : \n\n");  
       for(i=0; i<size; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
       scan.close();
       System.out.print("Sorting Array using Selection Sort Technique..\n");  
       for(i=0; i<size; i++)  
       {  
           for(j=i+1; j<size; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }  
           }  
       }  
       System.out.print("Now the Array after Sorting is :\n");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ "\t");  
       }  
   }   
}
