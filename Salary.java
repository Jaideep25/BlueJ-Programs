import java.util.*;

class Salary
{
    String name;
    double basic, da, hra, pf, netsal;
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Enter your basic salary");
        basic = in.nextDouble();
    }
    void calculate(){
        da = (35/100.0) * basic;
        hra = (15/100.0) * basic;
        pf = (12/100.0) * basic;
        netsal = basic + da + hra - pf;
    }
    void display(){
        System.out.println("Your name : "+name);
        System.out.println("Your basic salary : "+basic);
        System.out.println("Your net salary : "+netsal);
    }
    public static void main(String args[]){
        Salary jai = new Salary();
        jai.input();
        jai.calculate();
        jai.display();
    }
}