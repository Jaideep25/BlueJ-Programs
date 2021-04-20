import java.util.*;
public class SwitchNumbers
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        int n, choice;
        double sum=0;

        System.out.println("Enter 1 to find the sum of first n natural numbers");
        System.out.println("Enter 2 to find the sum of Squares of first n natural numbers");
        System.out.println("Enter 3 to find the sum of cubes of first n natural numbers");
        System.out.println("Type your choice");
        choice=x.nextInt();
        System.out.println("Enter the number");
        n=x.nextInt();
        x.close();
        switch(choice)
        {
            case 1: sum=(n*(n+1))/2.0;
            System.out.println("the sum of first n natural numbers:" +sum);
            break;
            case 2: sum=(n*(n+1)*(2*n+1))/6.0;
            System.out.println("the sum of squares of first n natural numbers:" +sum);
            break;
            case 3: sum=Math.pow(n*(n+1)/2, 2);
            System.out.println("the sum of cubes of first n natural numbers:" +sum);
        }
}
}
