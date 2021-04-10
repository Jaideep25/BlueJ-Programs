import java.util.Scanner;
class Allowances
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        double basic, da=0, sa=0, pf, gs, ns;
        System.out.println("Enter the name of the employee and the basic salary");
        name=in.next();
        basic=in.nextDouble();
        if(basic<=10000)
        {
            da=10.0/100*basic;
            sa=5.0/100*basic;
        }
        else if(basic>10000 && basic<=20000)
        {
            da=12.0/100*basic;
            sa=8.0/100*basic;
        }
        else if(basic>20000 && basic<=30000)
        {
            da=15.0/100*basic;
            sa=10.0/100*basic;
        }
        else if(basic>30000)
        {
            da=20.0/100*basic;
            sa=12.0/100*basic;
        }
        pf=8.33/100*basic;
        gs=basic+da+sa;
        ns=gs-pf;
        System.out.println("Name\t\tBasic\t\tGross Salary\t\tNetSalary");
        System.out.println(name+"\t\t"+basic+"\t\t"+gs+"\t\t"+ns);
}
}