import java.util.*;
class MidTermTest
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double call, bill = 0;
        System.out.println("ENTER THE NUMBER OF CALLS");
        call = in.nextDouble();
        if(call<=80){
            bill = call*0.6;
        }
        else if((call>80)&&(call<=160)){
            bill = 80*0.6+(call-80)*0.50;
        }
        else if(call>160){
            bill = 80*0.6+80*0.5+(call-160)*0.4;
        }
        System.out.println("NUMBER OF CALLS = "+call);
        System.out.println("BILL = "+bill+" Ruppee");
    }
}