import java.util.*;
class Palindrome_Armstrong_Perfect_Automorphic
{
    public static void main(String args[])
    {
        int ch, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        System.out.println("Enter your choice");
        System.out.println("1:Palindrome number \t 2:Amstrong number \n 3:Perfect number \t 4:Automorphic number");
        ch = in.nextInt();
        in.close();
        switch(ch)
        {
            case 1:
            int c, d=0, r=0;
            c = n; 
            while(c>0)
            {
                d = c%10;
                r = r*10+d;
                c = c/10;
            }
            if(n==r)
                System.out.println(n+" is a palindrome number");
            else
                System.out.println(n+" isn't a palindrome number");
            break;
            
            case 2: 
            int nl = 0, no = n, s=0;
            while(no>0)
            {
                nl = no%10;
                s = s+nl*nl*nl;
                no = no/10;
            }
            if(nl==s)
                System.out.println(n+" is an Amstrong number");
            else
                System.out.println(n+" isn't an Amstrong number");
            break;
            
            case 3:
            int a, sl=0;
            for(a=1;a<n;a++)
            {
                if(n%a==0)
                sl=sl+a;
            }
            if(sl==n)
                System.out.println(n+" is a perfect number");
            else
                System.out.println(n+" isn't a perfect number");
            break;
            case 4:
            int c1, b=0, atm;
            c1 = n;
            while(c1>0)
            {
                b++;
                c1=c1/10;
            }
            atm = (n*n)%(int)Math.pow(10,b);
            if(atm==n)
                System.out.println(n+" is a Automorphic number");
            else
                System.out.println(n+" isn't an Automorphic number");
            break;
            default :
            System.out.println("Wrong choice, enter a valid choice");
        }
    }
}