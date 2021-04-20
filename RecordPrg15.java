import java.util.*;
class RecordPrg15
{
    public static void main(String args[])
    {
        int no;
        int ab;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        no = in.nextInt();
        System.out.println("Enter \n 1 : Neon number \n 2 : Duck number");
        ab = in.nextInt();
        in.close();
        switch(ab)
        {
            case 1:
            int num;
            num = no;
            int square=num*num;
            int sum=0;
            
            while(square!=0)
            {
                int a=square%10;
                sum=sum+a;
                square=square/10;
            }
            
            if(sum==num)
                System.out.println(num+" is a Neon Number.");
            else
                System.out.println(num+" is not a Neon Number.");
                
            break;
            
            case 2 : 
            int n, ctr=0;
            n = no;
            while(n!=0)
            {
                if(n%10==0)
                ctr++;
                n=n/10;
            }
            
            if(ctr>0)
            System.out.println(no+" is a Duck number.");
            else
            System.out.println(no+" is not a Duck number."); 
            
            break;
            
            default :
            System.out.println("You haven't entered the correct choice");
        }
    }
}