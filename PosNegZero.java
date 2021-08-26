import java.util.*;

class PosNegZero {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a = in.nextInt();
        in.close();
        if (a > 0)
            System.out.println(a + " is positive");
        else if (a < 0)
            System.out.println(a + " is negative");
        else
            System.out.println(a + " is zero");

    }
}