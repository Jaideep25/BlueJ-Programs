import java.util.Scanner;

class SpecialNumber_UserDefined {

  // function to compute the factorial of the digits
  private static int factorial(int num) {
    int f = 1;
    for (int i = 2; i <= num; i++) {
      f = f * i;
    }
    return f;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int digit, n, sum = 0, temp;

    // 1. Input the number.
    System.out.println("Enter a number");
    n = in.nextInt();
    temp = n;
    in.close();
    // 2. Find the factorial of its digits.
    // 3. Add all the factorials.
    while (temp != 0) {
      digit = temp % 10;
      sum += factorial(digit);
      temp = temp / 10;
    }

    // 4. Check if the computed sum is equal to the original number.
    if (sum == n)
      System.out.println("Special number");
    else
      System.out.println("Not a Special Number");

  }
}