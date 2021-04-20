// nested if statement
import java.util.*;
class Shop
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          double p, dr = 0, amt, dis;
          String gift = "";
          System.out.println("Enter the amount of purchase");
          p = in.nextDouble();
          in.close();
        if(p<=2000){
           dr = 5.0;
           gift = "Wall Clock";
           }
        else if(p>=2001&&p<=5000){
           dr = 10.0;
           gift = "School Bag";
        }else if (p>=5001 && p<=10000)
          {
          dr=15.0;
          gift="Electric Iron";
          }
        else if (p>10000)
         {
          dr=20.0;
          gift="Wrist Watch";
        }
        dis= dr/100*p;
        amt=p-dis;
        System.out.println("Amount of purchase: Rs." +p);
        System.out.println("Discount: Rs." +dis);
        System.out.println("Assured Gift: " +gift);
        System.out.println("Amount to be paid: Rs." +amt);
    }
}
