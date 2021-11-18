import java.util.*;
public class Hotel {
    public static void main(String args[]) {
        double tariff = 0, disc, day, tot = 0;
        String na, a;
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Enter your name \n categories Type S-Semi delux,\t Type SD-Super delux,\t Type D for delux \n No of days stayed in the hotel");
        na = in.nextLine();
        a = in.nextLine();
        day = in.nextDouble();
        switch (a) {
            case "S":
                tariff = 2500 * day;
                break;
            case "D":
                tariff = 3500 * day;
                break;
            case "SD":
                tariff = 5000 * day;
                break;
        }
        if (day <= 3)
            tot = tariff - (10 / 100 * (tariff));
        disc = 10;
        if (day > 3 && day <= 5)
            tot = tariff - (15 / 100 * (tariff));
        disc = 15;
        if (day > 5 && day <= 10)
            tot = tariff - (20 / 100 * (tariff));
        disc = 20;
        if (day > 10)
            tot = tariff - (30 / 100 * (tariff));
        disc = 30;

        System.out.println("Name : " + na);
        System.out.println("Total amount to be paid : " + tot);
        System.out.println("Discount : " + disc);
        in.close();
    }

}
