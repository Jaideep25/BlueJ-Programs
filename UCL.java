import java.util.*;
class UCL
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n=0, spe=0, snc=0;
        for( ; ; ) //while(tre)
        {
            System.out.println("Enter 0 to stop OR enter any other number to calculate");
            n = ob.nextInt();
            if(n==0)
                break;
            else if(n>0 && n%2==0)
                spe += n;
            else if(n<0 && n%2==1)
                snc += n;
        }
        System.out.println("Sum of positive even numbers = "+spe);
        System.out.println("Sum of negative odd numbers = "+snc);
    }
}