// Java program to reverse a number
// and find if it is a palindrome or not
import java.util.*;
class Palindrome_UserDefined {
  
    // Iterative function to
    // reverse the digits of number
    static int reversNumber(int n)
    {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }
  
    // Main function
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter your number");
        n = in.nextInt();
        int reverseN = reversNumber(n);
        System.out.println("Reverse of n = " + reverseN);
        // Checking if n is same
        // as reverse of n
        in.close();
        if (n == reverseN)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}