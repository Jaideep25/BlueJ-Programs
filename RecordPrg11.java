import java.util.*;

class RecordPrg11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double q = 0;
        double c = 0;
        System.out.println("Enter the gallons of water consumed");
        q = in.nextDouble();
        in.close();
        if (q <= 45)
            System.out.println("NO Tax");
        else if (q >= 46 && q <= 75)
            c = 475.0 / 100.0 * q;
        else if (q >= 76 && q <= 125)
            c = 750.0 / 100.0 * q;
        else if (q >= 126 && q <= 200)
            c = 1225.0 / 100.0 * q;
        else
            c = 1650.0 / 100.0 * q;
        System.out.println("Gallons of water consumed = " + q);
        System.out.println("Tax = \u20B9" + c);
    }
}