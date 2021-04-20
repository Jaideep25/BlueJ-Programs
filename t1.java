import java.util.*;
class t1
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        char q;
        System.out.println("Enter A for area of circle and B for area of square");
        q = in.next().charAt(0);
        switch(q)
        {
            case 'A' : 
             double r, area;
             r = in.nextDouble();
             area = r*22/7;
              System.out.println("Area of the circle = "+area);
             case 'B' :
             double s, a;
             s = in.nextDouble();
             a = s*s;
             System.out.println("Area of the square = "+a);
            }
            in.close();
        }
}