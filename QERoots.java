import java.util.*;
class QERoots
     {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        //int a, b, c;
        int a, b, c; double d=0, r1, r2;
        System.out.println("Enter the value of a");
        a=in.nextInt();
        in.close();
        if(a==0)
           System.out.println("a=0, a b and c do not form QE");
        else
        {
          System.out.println("Enter the value of b");
          b=in.nextInt();
          System.out.println("Enter the value of c");
          c=in.nextInt();

          d=b*b-4*a*c;
       if(d>=0)
       {
       if(d==0)
       {
          System.out.println("Roots are real and equal");
       }
       else
       {
         System.out.println("Roots are real and unequal");
       }
       r1=(-b+Math.sqrt(d))/(2*a);
       r2=(-b-Math.sqrt(d))/(2*a);
       System.out.println("Root1:"+r1);
       System.out.println("Root2:"+r2);
       }
       else
          System.out.println("Roots are imaginary");
       }
   }
}