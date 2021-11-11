import java.util.*;

public class StringTime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s;
        char c;
        int i, u = 0, l = 0, d = 0, sp = 0;
        System.out.println("Enter a sentence");
        s = in.nextLine();
        in.close();
        
        for (i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isUpperCase(c))
                u++;
            else if (Character.isLowerCase(c))
                l++;
            else if (Character.isDigit(c))
                d++;
            else
                sp++;
        }
        System.out.println("Number of upper case characters = " + u);
        System.out.println("Number of lower case characters = " + l);
        System.out.println("Number of digits = " + d);
        System.out.println("Number of spaces = " + sp);
    }
}
