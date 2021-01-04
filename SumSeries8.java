// S=a-a/2!+a/3!-…… upto n terms
import java.util.*;
public class SumSeries8
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        int  a, f=2, i;
        double term, s=0;
        
        System.out.println("Enter the value of a");
        a=in.nextInt();
        for(i=1;i<20;i++)
        {
            f=f*i;
            term=(double)a/f;
            if(i%2==0)
            s=s-term;
            else
            s=s+term;
        }
        System.out.println("Sum of the series= " +s);
    } 
}