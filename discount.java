import java.util.*;
class discount
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double input, dis = 0, amt;
        System.out.println("ENTER THE TOTAL COST");
        input = in.nextDouble();
        {
            if(input<=5000)
            dis = (5/100)*input;
            else if((input>5001)&&(input<=10000))
            dis = (10/100)*input;
            else if(input>10000)
            dis = (15/100)*input;
            amt = input-dis;
            System.out.println("TOTAL COST = "+input);
            System.out.println("DISCOUNT = "+dis);
            System.out.println("AMOUNT = "+amt);
        }
    }
}
