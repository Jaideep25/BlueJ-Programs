import java.util.*;

class Array {
    public static void main(String args[]) {
        var ab = new Scanner(System.in);
        int i, k = 0, p = 0;
        int arr[] = new int[20];
        int even[] = new int[20];
        int odd[] = new int[20];
        System.out.println("Enter the values to the array");
        for (i = 0; i < 10; i++)
            arr[i] = ab.nextInt();
        for (i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                even[k] = arr[i];
                k++;
            } else {
                odd[p] = arr[i];
                p++;
            }
        }
        System.out.println("The elements of the even array");
        for (i = 0; i < k; i++) {
            System.out.println(even[i]);
        }
        System.out.println("The elements of the odd array");
        for (i = 0; i < p; i++) {
            System.out.println(odd[i]);
        }
        
    }
}