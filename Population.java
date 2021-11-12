import java.util.Scanner;

public class Population {
    String city;
    int present, t2, past, t1, n;
    double grate;

    Population() {
        city = "";
        present = 0;
        grate = 0;
        n = 0;
        past = 0;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the city : ");
        city = in.nextLine();
        System.out.print("Population of past year : ");
        past = in.nextInt();
        System.out.print("Population of present year : ");
        present = in.nextInt();
        System.out.print("Enter the past year : ");
        t1 = in.nextInt();
        System.out.print("Enter the present year : ");
        t2 = in.nextInt();
        in.close();
    }

    void calculate() {
        n = t2 - t1;
        double div = present / past;
        double na = n;
        // System.out.println(past);
        // System.out.println(present);
        grate = (Math.pow(div, (1 / na)) - 1) * 100;// ((present/past) 1/n-1)x100
    }

    void display() {
        System.out.println("\n\nName of the city : " + city);
        System.out.println("Difference in the years : " + n);
        System.out.println("Growth rate : " + grate + "%\n\n");
    }

    public static void main(String args[]) {
        Population jai = new Population();
        jai.input();
        jai.calculate();
        jai.display();
    }
}
