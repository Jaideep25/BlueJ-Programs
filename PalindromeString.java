
import java.util.*;

class PalindromeString {
    public static void main(String args[]) {
        String s = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word to check if it's Palindrome or No");
        s = in.nextLine();
        String rev = "";
        in.close();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (rev.equalsIgnoreCase(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
}
