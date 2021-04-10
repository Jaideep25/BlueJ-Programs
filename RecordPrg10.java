import java.util.*;
class RecordPrg10
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int days = 0;
        System.out.println("Enter the number of days");
        days = in.nextInt();
        double fineamt = 0;
        if(days <= 5)
            fineamt = days*0.40;
        else if(days >= 6 && days <= 10)
            fineamt = days*0.65;
        else if(days > 11)
            fineamt = days*0.80;
        System.out.println ("Fine Amount = \u20B9"+fineamt);
    }
}