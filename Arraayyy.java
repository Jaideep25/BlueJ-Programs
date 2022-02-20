import java.util.Scanner;

public class Arraayyy
{
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        
        System.out.print("Enter number to search: ");
        int n = in.nextInt();
        
        int l = 0, h = arr.length - 1, ind = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] < n)
                l = m + 1;
            else if (arr[m] > n)
                h = m - 1;
            else {
                ind = m;
                break;
            }
                
        }
        
        if (ind == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println(n + " found at position " + ind);
        }
    }
}