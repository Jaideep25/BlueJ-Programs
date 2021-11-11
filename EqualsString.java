public class EqualsString {
    public static void main(String args[]){
        String a = "Comp";
        String b = "CoooomP";
        String c = "COMP";


        // Part 111111111
        if(a.equals(b))
            System.out.println("Stringgggggg ========= Yeeeeeeeeeee \n\n\n");
        else
            System.out.println("Stringgggggg ========= Nuuuuuuuuuuu \n\n\n");

        // Partttt 22222222
        System.out.println("A compareee toooooooooo B :::: "+a.compareTo(b));
        System.out.println("B compareee toooooooooo C :::: "+b.compareTo(c));
        System.out.println("C compareee toooooooooo A :::: "+c.compareTo(a));
        System.out.print("\n\n\n\n");

        // Parttt 333333333
        System.out.println("A compARE TOOOOOO b ::::::::: "+a.compareToIgnoreCase(b));
        System.out.println("B compARE TOOOOOO c ::::::::: "+b.compareToIgnoreCase(c));
        System.out.println("C compARE TOOOOOO a ::::::::: "+c.compareToIgnoreCase(a));
    }
}
