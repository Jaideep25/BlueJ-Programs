import java.util.*;
class BUZZ
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("ENTER A NUMBER");
        n = in.nextInt();
        in.close();
        if((n%10==7)&&(n%7==0))
            System.out.println(n+" It's a buzz number");
        else
            System.out.println(n+" It's not a buzz number");
        }
    }