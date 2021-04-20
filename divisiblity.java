/*Write a program to accept a number and check
(i) If it is divisible by 5 and not by 3, display “The
number is divisible only by 5”.
(ii)If it is divisible by 3 and not by 5, display “The
number is divisible only by 3”.
(iii) If it is divisible by 3 & 5, display “The number is
divisible by both 5 and 3”.
(iv) If it is not divisible by 3 and also 5, “The number is
not divisible by 3 and 5”.*/
import java.util.*;
class divisiblity
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int m = 0;
        System.out.println("Enter a number");
        m = in.nextInt();
        in.close();
        if((m%5==0)&&(m%3!=0))
            System.out.println("Number is divisible only by 5");
        if((m%3==0)&&(m%5!=0))
            System.out.println("The number is divisible by 3 only");
        if((m%3!=0)&&(m%5!=0))
            System.out.println("The number is not divisible by 3 and 5");
        }
    }