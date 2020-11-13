import java.util.*;
class hola
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=in.nextInt();

        if((n%5==0) && (n%3!=0))
            System.out.println("The number is divisible only by 5");
        if((n%3==0) && (n%5!=0))
            System.out.println("The number is divisible only by 3");
        if((n%5==0) && (n%3==0))
            System.out.println("The number is divisible by both 5 and 3");
        if((n%3!=0) && (n%5!=0))
            System.out.println("The number is not divisible by 3 and 5");
    }
}