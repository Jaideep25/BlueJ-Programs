import java.util.*;

class taxi {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double km, amt = 0;
        String name = "";
        String taxino = "";
        System.out.println("ENTER YOUR NAME");
        name = in.nextLine();
        System.out.println("ENTER THE TAXI NUMBER");
        taxino = in.nextLine();
        System.out.println("ENTER THE KILOMETERS TRAVELLED");
        km = in.nextDouble();
        in.close();
        if (km <= 10)
            amt = 25 * km;
        else if (km > 10 && km <= 30)
            amt = 25 * 10 + 10 * (km - 10);
        else if (km > 30 && km <= 70)
            amt = 25 * 10 + 10 * 20 + 15 * (km - 30);
        else if (km < 70)
            amt = 25 * 10 + 10 * 20 + 15 * 30 + 12 * (km - 70);
        System.out.println("Name of the customer = " + name);
        System.out.println("Taxi Number = " + taxino);
        System.out.println("Kilometers covered = " + km);
        System.out.println("Amount to be payed = \u20b984" + amt);
    }
}