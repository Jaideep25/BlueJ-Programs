import java.util.*;
class Salary_UserDefined
{
    String name = "";
    double basic, da, hra, pf, netsal;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Enter your salary");
        basic = in.nextInt();
        in.close();
        System.out.println('\f');
    }
    void calculate(){
        da = (35/100.0)*basic;
        hra = (15/100.0)*basic;
        pf = (12/100.0)*basic;
        netsal = basic+da+hra-pf;
    }
    void display(){
        System.out.println("Name of the employee : "+ name);
        System.out.println("Salary of the employee"+basic);
        System.out.println("Net Salary of the employee : "+netsal);
    }
    public static void main(String args[])
    {
        Salary_UserDefined jai = new Salary_UserDefined();
        jai.input();
        jai.calculate();
        jai.display();
    }
}