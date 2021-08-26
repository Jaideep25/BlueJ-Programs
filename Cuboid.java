import java.util.*;

public class Cuboid {
    int length, breadth, height;

    public Cuboid(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    void surfacearea() {
        double area;
        area = 2 * ((length * breadth) + (breadth * height) + (height * length));
        System.out.println("Surface area=" + area);
    }

    void volume() {
        double vol;
        vol = length * breadth * height;
        System.out.println("Volume=" + vol);
    }

    /*
     * public static void main(String args[]) { Cuboid C1 = new Cuboid(5, 6, 7); //
     * Method 1: directly passing constants C1.surfacearea(); C1.volume(); }
     */
    // End of class

    /*
     * Method 2: You can also accept input from the user to construct the object
     * (Replace the highlighted part with the main() given below:
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int l1, b1, h1;
        System.out.println("Enter length, breadth and height of the cuboid");
        l1 = in.nextInt();
        b1 = in.nextInt();
        h1 = in.nextInt();
        Cuboid C1 = new Cuboid(l1, b1, h1); // directly passing constants 
        C1.surfacearea(); 
        C1.volume();
        in.close();
    }
}