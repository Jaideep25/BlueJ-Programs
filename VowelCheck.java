import java.util.*;
class VowelCheck
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        char alpha;
        System.out.println("ENTER A LETTER");
        alpha = x.next().charAt(0);
        switch(alpha)
        {
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' : 
            case 'U' : 
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :System.out.println("The entered alphabet is a Vowel");
            break;
            case '1' :
            case '2' :
            case '3' :
            case '4' :
            case '5' : 
            case '6' :
            case '7' : 
            case '8' : 
            case '9' :System.out.println("PLEASE ENTER AN ALPHABET NOT A NUMBER");
            break;
            default:System.out.println("The entered alphabet is a Consonant");
        }
    }
}