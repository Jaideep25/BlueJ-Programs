import java.util.*;
class RecordPrg9
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the 1st number");
        a = in.nextInt();
        System.out.println("Enter the 2nd number");
        b = in.nextInt();
        System.out.println("Enter the 3rd number");
        c = in.nextInt();
        in.close();
        if((a*a)+(b*b)==(c*c))
            System.out.println("The following numbers can form a Pythagorean triplet");
        else
            System.out.println("The following numbers cannot form a Pythagorean triplet");
        }
    }