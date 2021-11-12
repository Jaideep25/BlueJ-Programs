
import java.util.*;
class Palindrome
{
    public static void main(String s)
    {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        if(rev.equalsIgnoreCase(s))
        System.out.println("Palindrome");
        else
        System.out.println("Not a Palindrome");
        
        
        
        
    }
}
