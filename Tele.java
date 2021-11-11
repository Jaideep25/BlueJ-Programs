import java.util.*;

class Tele {
    String name;
    int call;
    double charge = 0, billAmount = 0;

    void getData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Number of calls made by you");
        call = in.nextInt();
        in.close();
    }

    void compute() {
        if (call <= 100)
            charge = 0;
        else if ((call >= 101) && (call <= 300))
            charge = ((call - 100) * 1.5);
        else if ((call >= 301) && (call <= 600))
            charge = (200 * 1.5) + (call - 300) * 2.00;
        else if (call >= 601)
            charge = (200 * 1.5) + (300 * 2.0) + (call - 600) * 3.00;
        billAmount = charge + 200;
    }

    void display() {
        System.out.println("Your name : " + name);
        System.out.println("Number of calls made : " + call);
        System.out.println("Amount to be paid : " + billAmount);
    }

    public static void main(String args[]) {
        Tele jai = new Tele();
        jai.getData();
        jai.compute();
        jai.display();
    }
}