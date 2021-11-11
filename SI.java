
// a program to find SI
import java.util.*;

class SI {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double p, r, t;
        double SI;
        System.out.println(
                "ENTER THE PRINCIPAL, RATE OF INTEREST AND TIME OF INVESTMENT OF PRINCIPAL IN THE BANK(CALCULATIONS ARE DONE USING SI)");
        p = in.nextDouble();
        r = in.nextDouble();
        t = in.nextDouble();
        in.close();
        SI = (p * r * t) / 100.0;
        System.out.println("Principal = " + p);
        System.out.println("Rate of Intrest = " + r);
        System.out.println("Time = " + t);
        System.out.println("Simple Intrest = " + SI);
    }
}