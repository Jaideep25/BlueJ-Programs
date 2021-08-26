
/*2. Create a class with the following specifications:
Class Name : Result
Data Members : 
String name, res; to store name of the student and result.
double tot, per; to store total scored for 600 and percentage
Member Methods:
(i) Default constructor : 
to initialize with data members with default values
(ii) void getData() : To accept the required details.
(iii) void calculate() : To calculate percentage and result as given below:
Distinction: >=85%, First Class: >=60% and <85%, Second Class: >=50% and 
<60%, Pass Class: >=35% and <50%, display Promotion not granted : <35% 
(iv) void display() : to display name, total, percentage and result
Write main() and call member methods */
import java.util.*;

class Resul_Cons {
    String name, res;
    double tot, per;

    Resul_Cons() {
        name = "";
        res = "";
        tot = per = 0.0;
    }

    void getData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of the student and total for 600");
        name = in.next();
        tot = in.nextDouble();
        in.close();
    }

    void calculate() {
        per = tot / 600 * 100;
        if (per >= 85)
            res = "Distinction";
        else if (per >= 60 && per < 85)
            res = "First Class";
        else if (per >= 50 && per < 60)
            res = "First Class";
        else if (per >= 35 && per < 50)
            res = "Pass Class";
        else if (per < 35)
            res = "Promotion not Granted";
    }

    void display() {
        System.out.println("Name of the Student : " + name);
        System.out.println("Total marks : " + tot);
        System.out.println("Percentage : " + per);
        System.out.println("Result : " + res);
    }

    public static void main(String args[]) {
        Resul_Cons S1 = new Resul_Cons();
        S1.getData();
        S1.calculate();
        S1.display();
    }
}
