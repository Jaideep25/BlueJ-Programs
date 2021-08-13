import java.util.*;
class Salary_UserDefined
{
 String name;
 int empno;
 double net,basic,gross, da, pf, hra;
Salary_UserDefined()
{
 name="";
 empno=0;
 basic=0.0;
 
}
Salary_UserDefined(String n, int no, double bas)
 {
 name=n;
 empno = no;
 basic=bas;
 }

public void input()
{
 Scanner in=new Scanner(System.in);
 System.out.println("Enter the name of the Employee, and the empno");
 name=in.next();
 empno=in.nextInt();
 System.out.println("Enter the basic salary");
 basic=in.nextDouble();
}
public void compute()
{
  da=30.0/100*basic;
  hra=15.0/100*basic;
  pf=12.0/100*basic;
 gross=basic+da+hra;
 net=gross-pf;
}
public void display()
{
 System.out.println("Name\t\tBasic Salary\t\tNet Salary");
 System.out.println(name+"\t\t"+basic+"\t\t\t"+net);
}
public static void main(String args[])
{
 //Salary_UserDefined deep=new Salary_UserDefined();
 //deep.input();
 //deep.compute();
 //deep.display();

 Scanner in=new Scanner(System.in);
 System.out.println("Enter the name of the Employee, and the empno");
 String n1=in.next();
 int e1=in.nextInt();
 System.out.println("Enter the basic salary");
 double b1=in.nextDouble();

 Salary_UserDefined jai=new Salary_UserDefined(n1, e1, b1);
 jai.compute();
 jai.display();
}
}
