import java.util.*;
class trichk
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double a, b, c, p;
        System.out.println("Enter the 1st side of the triangle");
        a = in.nextDouble();
        System.out.println("Enter the 2nd side of the triangle");
        b = in.nextDouble();
        System.out.println("Enter the 3rd side of the triangle");
        c = in.nextDouble();
        in.close();
        if((a+b>c)&&(b+c>a)&&(a+c>b))
        {
           System.out.println("Triangle is possible");
           if((a==b)&&(b==c)&&(c==a))
             System.out.println("Equilateral Triangle");
           else if((a==b)||(b==c)||(c==a))
             System.out.println("Isosceles Triangle");
           else if((a!=b)&&(b!=c)&&(c!=a))
           System.out.println("Scalene Triangle");
           p=a+b+c;
           System.out.println("Perimeter of triangle="+p);
        }
        else
           System.out.println("Triangle is not possible");
    }
}