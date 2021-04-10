import java.util.*;
class Interest
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int age;
        double principal, term, i, amt, r=0;
        System.out.println("Enter the amount deposited");
        principal=in.nextDouble();
        System.out.println("Enter the term of deposit");
        term=in.nextDouble ();
        System.out.println("Enter the age");
        age=in.nextInt();
        if(age<=60)
        {
            if(term<=1)
                r=7.5;
            else if(term>1 && term<=2)
                r=8.5;
            else if(term>2 && term<=3)
                r=9.5;
            else if(term>3)
                r=10.0;
        }
        else if(age>60)
        {
            if(term<=1)
                r=8.0;
            else if(term>1 && term<=2)
                r=9.0;
            else if(term>2 && term<=3)
                r=10.0;
            else if(term>3)
                r=11.0;
        }
        i=principal*r*term/100;
        amt=principal+i;
        System.out.println("Interest earned:" +i);
        System.out.println("Amount Paid:" +amt);
    }
}