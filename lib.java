import java.util.*;

class lib {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String name = "";
        double f = 0, d;
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Enter the number of days the book is returned late");
        d = in.nextDouble();
        in.close();
        if (d <= 5)
            f = 0.4 * d;

        else if (d > 5 && d <= 10)
            f = (0.4 * 5) + (0.65 * (d - 5));

        else if (d > 10 && d < 20)
            f = (0.4 * 5) + (0.65 * 5) + (0.8 * (d - 10));

        else if (d > 20)
            f = (0.4 * 5) + (0.65 * 5) + (0.8 * 10) + (2 * (d - 20));

        System.out.println("NAME = " + name);
        System.out.println("Number of days the book is returned late = " + d);
        System.out.println("Fine to be paid = \u20B9" + f);
    }
}