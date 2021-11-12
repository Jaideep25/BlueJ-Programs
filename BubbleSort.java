import java.util.*;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[1000], size;
        System.out.print("Enter Array Size : ");
        size = in.nextInt();
        in.close();
        System.out.print("Enter Array Elements : \n\n");
        for (int i = 0; i < size; i++) 
            arr[i] = in.nextInt();
        

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    
        System.out.println("\n\n\n\n");
        bubbleSort(arr);// sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
        // function reverses the elements of the array
        for(int i=0; i<arr.length; i++)  
       {  
           System.out.print(arr[i]+ "\t");  
       }

    }
}
