import java.util.*;

class RecordPrg8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double a;
        double dis, ra, st, pa;
        System.out.println("Enter the marked price of the camera");
        a = in.nextDouble();
        in.close();
        dis = 0.10 * a;
        ra = a - dis;
        st = 0.06 * ra;
        pa = ra + st;
        System.out.println("Discount = \u20B9" + dis);
        System.out.println("Tax = \u20B9" + st);
        System.out.println("Paid amount= \u20B9" + pa);
    }
}