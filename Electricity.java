import java.util.*;
class Electricity
{
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int u;
     String name = "";
     double amt=0;
     System.out.println("Enter the name of the consumer:");
     name=in.nextLine();
     System.out.println("Enter the units consumed:");
     u=in.nextInt();
     in.close();
     if(u<=200)
        amt=u*4;
     else if(u>200 && u<=500)
          amt=(200*4)+(u-200)*5;
     else if (u>500)
          amt=(200*4)+(300*5)+(u-500)*6;
     System.out.println("Consumer Name:"+name);
     System.out.println("The unit consumed: " +u+" units");
     System.out.println("Amount to be paid:\u20B9" +amt);
  }
}