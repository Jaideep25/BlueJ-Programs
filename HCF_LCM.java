import java.util.*;
class HCF_LCM 
{
    public static void main(String args[])
    {
        int a, b, hcf = 0, lcm;
        String s = "";
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Enter 2 numbers");
            a = in.nextInt();
            b = in.nextInt();
            for(int i = 1; i<=(a*b);i++)
            {
                if((a%i==0)&&(b%i==0))
                    hcf = i;
            }
            lcm = (a*b)/hcf;
            System.out.println("H.C.F = "+hcf+"\n L.C.M = "+lcm);
            System.out.println("Do you want ot continue? YES or NO");
            s = in.nextLine();
            if(s.equalsIgnoreCase("yes"))
                continue;
            else if(s.equalsIgnoreCase("no"))
                break;
            else
                System.out.println("Invalid Output");
            break;
        }
        while(s.equalsIgnoreCase("yes"));
    }
}