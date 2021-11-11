import java.util.*;

public class DudeneyNumber {
    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = z.nextInt();

        int n1 = n; // Creating a copy of the number
        int sum = 0; // Variable to calculate sum of digits
        while (n > 0) {
            int d = n % 10; // Extracting the Digit
            sum = sum + d; // Calculating the sum of Digits
            n = n / 10; // Reducing the number of Digit by 1 (removing the units Digit)
        }
        if (sum==Math.cbrt(n1)) // Condition for a Dudeney Number
            System.out.println("Yes; A Dudeney Number");
        else
            System.out.println("Not a Dudeney Number");
            z.close();
    }
}