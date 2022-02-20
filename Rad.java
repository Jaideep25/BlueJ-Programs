import java.util.*;
class Rad{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word :- ");
        String abc = in.next();
        int sp = 0, arc = 1;
        for(int i = 0; i<abc.length(); i++, arc++){
            if((abc.charAt(arc))==(abc.charAt(abc.length()))){
                sp++;
            }
            else{
                System.out.println("Not palindrome");
                break;
            }
            System.out.println(abc);
            if(sp==(abc.length()-2))
                System.out.println("Ooolaalaaaa");
        }
    }
}