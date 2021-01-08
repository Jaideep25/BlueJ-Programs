import java.util.*;
class RecordPrg16
{
    public static void main(String args[])
    {
        int age,n,i=1,a18=0,a5=0,ab5=0,t1=0,t2=0, ticket_amt=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of passengers");
        n = sc.nextInt();
        while(i<=n)
        {
            System.out.println("Enter the age of the passengers");
            age = sc.nextInt();
            if(age >=18)
            {
                a18=a18+1;
                t1= a18*5;
            }
            else if(age>5 && age <=18)
            {
                a5=a5+1;
                t2=a5*3;
            }
            else if(age>0 && age<=5)
            ab5 = ab5+1;
            i++;
        }
        ticket_amt=t1+t2;
        System.out.println("No. of passengers with the age group 18 and above="+a18 );
        System.out.println("No. of passengers with the age group >than 5 and < than 18="+a5);
        System.out.println("No. of passengers with the age group < than 5="+ab5);
        System.out.println("Total amount collected="+ticket_amt+ " Rs"); 
    }
}