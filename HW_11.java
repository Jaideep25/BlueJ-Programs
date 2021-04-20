// a program to find the total and average of the following nos
import java.util.*;
class HW_11
{
    public static void main (String args[])
    {
        Scanner in= new Scanner(System.in);
        double x,y,z,a,b,c,sum,avg;
        System.out.println("ENTER THE VALUES OF a,b,c,x,y,z IN ORDER");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        x=in.nextDouble();
        y=in.nextDouble();
        z=in.nextDouble();
        in.close();
        sum = x+y+z+a+b+c;
        avg = sum/6.0;
        System.out.println("Sum of x, y, z, a, b and c ="+sum);
        System.out.println("Average of x, y, z, a, b, and c ="+avg);
    }
}