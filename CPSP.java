import java.util.*;
class CPSP
{
      public static void main(String args[])
      {
          Scanner in = new Scanner(System.in);
          double PP, LP, CP, SP;
          System.out.println("Enter the CP & SP of the article");
          CP = in.nextDouble();
          SP = in.nextDouble();
          in.close();
          if(SP>CP)
          {
             PP=(SP-CP)/CP*100.0;
             System.out.println("Profit Percent: " +PP);
          }
          else if(SP<CP)
          {
             LP=(CP-SP)/CP*100.0;
             System.out.println("Loss Percent: " +LP);
          }
          else
             System.out.println("Neither Loss nor Profit");
    }
}