
/*
6. Create a class with the following specifications:
Class Name : Security
Data Members / Instance Variables: 
String n : to store name of the worker
int h : to store number of hours, for which he wages to be paid
double r : to store the rate of wages
double w : to calculate the wages
Member Methods:
(i) Default constructor : 
 to initialize with data members with actual(any) values
(ii) Parameterised constructor : 
 to initialize with data members with parametric values
(iii) void calWage() :
No. of hours Rate
Up to 40 hours Rs. r / hour
For the next 20 hours Rs. 1.5 r /hour
For the next 30 hours Rs. 2 r /hour
 How ever security is allowed to work more than 70 hours/week.
(iv) void display() to display Name, Hours and Wages in tabular form.
Include main() to create object and call the member methods.*/
import java.util.*;

class Security {
    String n;
    int h;
    double r, w;

    Security() {
        n = "Vijay";
        h = 50;
        r = 250;
    }

    Security(String name, int hour, double rate) {
        n = name;
        h = hour;
        r = rate;
    }

    public void calWage() {
        if (h <= 40)
            w = h * r;
        else if (h > 40 && h <= 60)
            w = 40 * r + ((h - 40) * 1.5 * r);
        else if (h > 60 && h <= 80)
            w = 40 * r + 20 * 1.5 * r + ((h - 60) * 2 * r);
        else
            System.out.println("Number of hours cannot be more than 80");
    }

    public void display() {
        System.out.println("Name \t\t Hours \t\t Rate \t\t Wages");
        System.out.println(n + "\t\t" + h + "\t\t" + r + "\t\t" + w);
    }

    public static void main(String args[]) {
        Security s1 = new Security();
        s1.calWage();
        s1.display();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name");
        String n1 = in.next();
        System.out.println("Enter the hour");
        int h1 = in.nextInt();
        System.out.println("Enter the rate");
        double r1 = in.nextDouble();

        Security s2 = new Security(n1, h1, r1);
        s2.calWage();
        s2.display();
        in.close();
    }
}