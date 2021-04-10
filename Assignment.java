import java.util.*;
class Assignment
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        char alpha;
        int i = 0;
        System.out.println("ENTER A LETTER");
        alpha = x.next().charAt(0);
        if(i >=65 && i <= 90){
            System.out.println("The entered alphabet is a Vowel");
            System.out.println("PLEASE ENTER AN ALPHABET NOT A NUMBER");
            System.out.println("The entered alphabet is a Consonant");
        }
        
    }
}
