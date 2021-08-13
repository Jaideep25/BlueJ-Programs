import java.util.Scanner;
class Employee
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name, empno;
        double basic, da=0, sa=0, pf, gross, net;
        System.out.println("Enter the name of the employee, the empno and the basic salary");
        name=in.next();
        empno = in.next();
        basic=in.nextDouble();
        in.close();
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
        gross=basic+da+sa;
        net=gross-pf;
        System.out.println("Name\tBasic\tGross Salary\tNetSalary");
        System.out.println(name+"\t"+basic+"\t"+gross+"\t\t"+net);
    }
}