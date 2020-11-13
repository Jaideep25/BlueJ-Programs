import java.util.*;
class SwitchInt
{
    public static void main(String args[])
     {
        Scanner in = new Scanner(System.in);
        int a,b;
        char ch;
        System.out.println("Enter 2 numbers");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Enter the choice : \n A for ADDITION \n S for SUBTRACTION \n M for MULTIPLICATION \n OR \n D for DIVISION");
        ch = in.next().charAt(0);
        switch(ch)
        {
            case 'A':
            System.out.println("SUM = "+(a+b));
            break;
            case 'S':
            System.out.println("DIFFERENCE = "+(a-b));
            break;
            case 'M':
            System.out.println("MULTIPLICATION = "+(a*b));
            break;
            case 'D':
            System.out.println("DIVISION = "+(a/b));
            break;
            default :
            System.out.println("Invalid Choice");
        } 
    }
}