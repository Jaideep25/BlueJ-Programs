import java.util.Scanner;
public class ElectricBill
{
    String n;
    int units;
    double bill;
    public void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name of the customer and the units consumed");
        n=in.nextLine();
        units=in.nextInt();
    }
    void calculate()
    {
        if(units<=100)
            bill=units*2;
        else if(units>100 && units<=300)
            bill=100*2+(units-100)*3;
        else if(units>300)
        {
            bill=100*2+200*3+(units-300)*5;
            double surcharge=2.5/100*bill;
            bill=bill+surcharge; 
        }
    }
    void print()
    {
        System.out.println("Name of the customer : "+n);
        System.out.println("Number of units consumed : "+units);
        System.out.println("Bill amount : "+bill);
    }
    public static void main(String args[])
    {
        ElectricBill ob=new ElectricBill();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}