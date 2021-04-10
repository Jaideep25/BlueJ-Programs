import java.util.*;
class RailwayFare
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double age, km, rs = 0;
        String name = "";
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Enter your age");
        age = in.nextInt();
        System.out.println("Enter the distance to be travelled(in km)");
        km = in.nextDouble();
        if(age<10){
            if(km<=10)
                System.out.println("Fare for the travel = \u20b984"+"5");
            else if(km>10 && km<=50)
                System.out.println("Fare for the travel = \u20b984"+"20");
            else if(km>50)
                System.out.println("Fare for the travel = \u20b984"+"50");
            }
        else if(age>10 && age<=60){
            if(km<=10)
                System.out.println("Fare for the travel = \u20b984"+"10");
            else if(km>10 && km<=50)
                System.out.println("Fare for the travel = \u20b984"+"40");
            else if(km>50)
                System.out.println("Fare for the travel = \u20b984"+"80");
        }
        else if(age>60){
            if(km<=10)
               System.out.println("Fare for the travel = \u20b984"+"4");
            else if(km>10 && km<=50)
               System.out.println("Fare for the travel = \u20b984"+"15");
            else if(km>50)
               System.out.println("Fare for the travel = \u20b984"+"35");
        }
        
        System.out.println("NAME OF THE CUSTOMER = "+name);
        System.out.println("Age of the customer = "+age);
        System.out.println("Distance to be travelled = "+km);
    }
}