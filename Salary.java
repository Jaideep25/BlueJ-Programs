import java.util.*;

class Salary {
    String name, add, sub;
    long ph;
    double msal, tax;

    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name, address and phone number");
        name = in.nextLine();
        add = in.nextLine();
        ph = in.nextLong();
        System.out.println("Enter subject specialization");
        sub = in.next();
        System.out.println("Enter monthly salary");
        msal = in.nextDouble();
    }

    void calculate() {
        double annualSal = 12 * msal;
        if (annualSal > 175000)
            tax = annualSal * 5.0 / 100;
        else
            tax = 0;
    }

    void display() {
        System.out.println("Name of the teacher : " + name);
        System.out.println("Address : " + add);
        System.out.println("Phone number : " + ph);
        System.out.println("Subject Specialization : " + sub);
        System.out.println("Monthly Salary : " + msal);
        System.out.println("Income Tax : /20B9" + tax);
    }

    public static void main(String args[]) {
        Salary Teacher1 = new Salary();
        Teacher1.accept();
        Teacher1.calculate();
        Teacher1.display();
    }
}