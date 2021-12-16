/**
 * VARIABLE DESCRIPTION :-
 * All strings 🙄 :---- PL ~ Pig Latin, prev ~ Word before pig latin, post ~ Word just before pig latin was ready.
 * All int :------ len ~ Used to store the length of the word, postvov ~ Findin position of vowel.
 * All char :------ j ~ Checking each & every letter if it's a vowel.
 * 
 * Pig Latin is a language game in English in which words are altered according to the rules. It is also known as Igpay Atinlay. The given word encrypted into the same language
 * 
 * Code n understanding by :- Jaideep25 ©️
 */
import java.util.*;
class PigLearntLatin
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        int len; //length
        String PL = "", prev = "", post = "";
        char j;
        int posvov = -1; // In val of vowel -1

        System.out.print("Enter the word ~ ");
        String inp = in.next();
        len = inp.length();

        for(int i=0; i<len; i++){
            j = inp.charAt(i);
            if(j == 'a' || j == 'A' || j == 'e' || j == 'E' || j == 'I' || j == 'i' || j == 'o' || j == 'O' || j == 'u' || j == 'U'){
                posvov = i;
                System.out.println("Position of 1st vowel ~ "+posvov);
                break;
            }
        }
        if(posvov >= 0){
            prev = inp.substring(0, posvov);
            post = inp.substring(posvov);
            PL = post+prev+"ay.";
            System.out.println("Pig Latin of ~ "+inp+" is ~ "+PL.toLowerCase());
        }
        else{
            System.out.println("No vowels found ;-;");
        }
        in.close();
    }
}
/* What adi had done :- 
import java.util.*;
class Pig
{
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word");
        String x=ob.next();
        String y=x.toLowerCase();
        int i;
        for( i=0;i<y.length();i++)
        {
            if( y.charAt(i)  == 'a' ||y.charAt(i) == 'e' ||y.charAt(i) == 'i' || y.charAt(i) =='o' ||y.charAt(i) == 'u')
                break;

        }
        System.out.println((x.substring(i) = x.substring(0,i) = "ay"));
    }
}
*/