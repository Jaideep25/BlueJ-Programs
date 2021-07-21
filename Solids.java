import java.util.Scanner;

public class Solids {
    public static double volume(double r, double h){
        double vol = (1/3.0)*(22/7.0)*r*r*h;
        return vol;
    }
    public static double volume(double r){
        double vol = (4/3.0)*(22/7.0)*r*r*r;
        return vol;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius and height for the volume of the cone");
        double r = in.nextDouble();
        double h = in.nextDouble();
        System.out.println("Volume of cone :"+Solids.volume(r,h));
        System.out.println("Enter the radius for volume of sphere");
        r = in.nextDouble();
        System.out.println("Volume of sphere : "+Solids.volume(r));
    }
}