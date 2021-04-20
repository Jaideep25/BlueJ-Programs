import java.util.*;
class confusing
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String name  = " ";
        double units, bill = 0;
        System.out.println("NAME OF CONSUMER");
        name = in.nextLine();
        System.out.println("ENTER THE NUMBER OF UNITS CONSUMED");
        units = in.nextDouble();
        in.close();
        if(units<=200)
        {
            bill = 4.0*units;
        }
        else if((units>201) && (units<=500)){
            bill = (4.0*200)+(5.0*(units-200));
        }
        else if(units>500){
            bill = (4.0*200)+(5.0*300)+(6.0*units);
        }
        System.out.println("Your name :"+ name);
        System.out.println("UNITS CONSUMED = "+units);
        System.out.println("BILL = \u20B9"+bill);
    }
}
