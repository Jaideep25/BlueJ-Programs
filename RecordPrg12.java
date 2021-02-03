import java.util.*;
class RecordPrg12
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int c, p;
        double dp,ddc,td = 0,flatprice = 0;
        System.out.println("Enter the price");
        p=in.nextInt();
        System.out.println("Enter 0 for ground floor, \n 1 for first floor \n 2 for second floor \n 3 for third floor");
        c=in.nextInt();
        switch(c)
        {
            case 0:
            dp=10.0/100.0*p;
            ddc=8.0/100.0*p;
            td=dp+ddc;
            flatprice=p-td;
            break;
            case 1:
            dp=2.0/100.0*p;
            ddc=1.0/100.0*p;
            td=dp+ddc;
            flatprice=p-td;
            break;
            case 2:
            dp=5.0/100.0*p;
            ddc=5.0/100.0*p;
            td=dp+ddc;
            flatprice=p-td;
            break;
            case 3:
            dp=7.5/100.0*p;
            ddc=10.0/100.0*p;
            td=dp+ddc;
            flatprice=p-td;
            break;
            default:
            System.out.println("Wrong choice");
        }
        System.out.println("Total discount= "+td);
        System.out.println("Price to be paid= "+flatprice);
    }
}