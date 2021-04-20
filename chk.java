import java.util.*;
public class chk
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a string");
        String st=in.nextLine();
        String s=st.toUpperCase();
        s=" " +s;
        in.close();
        char ch;
        int i,count=0;
        for(i=0;i<s.length()-1;i++)
        {
            ch=s.charAt(i);
            if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
            {
                count++;
            }
        }
 
        System.out.println("Number of words in a string = " +count);
    }
}

            