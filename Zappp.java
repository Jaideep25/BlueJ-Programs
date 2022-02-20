import java.util.Scanner;

class Zappp {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String jaa, st1 = "";
        int i;
        char ch;
        System.out.println("Enter a string");
        jaa = in.nextLine();
        for (i = 0; i < jaa.length(); i++) {
            ch = jaa.charAt(i);
            if (ch !=73 && ch!=69 && ch!=79 && ch!=85 && ch!=97 && ch!=101 && ch!=105 && ch!=111 && ch!=117 && ch!=65)
                continue;
            else
                st1 = st1 + ch;
        }
        in.close();
        System.out.println("The new word after learning english is :- " + st1);
    }
}