import java.util.*;
class SwitchVolume 
{
    public static void main(String args[])
    {
        Scanner ab = new Scanner(System.in);
        int ch;
        System.out.println("Enter '1' for volume of cube \n '2' for volume of sphere \n '3' for volume of cuboid");
        ch = ab.nextInt();
        switch(ch)
        {
            case 1:
            double s, cube;
            System.out.println("Enter the length of side");
            s = ab.nextInt();
            cube = s*s*s;
            System.out.println("Volume of cube : "+cube);
            break;
            case 2:
            double r, sphere;
            double p = 22.0/7;
            System.out.println("Enter the value of radius");
            r = ab.nextDouble();
            sphere = ((4.0/3)*p*(r*r*r));
            System.out.println("Volume of sphere : "+sphere);
            break;
            case 3:
            double l,b,h,cuboid;
            System.out.println("Enter the value of length breadth and height : ");
            l = ab.nextDouble();
            b = ab.nextDouble();
            h = ab.nextDouble();
            cuboid = l*b*h;
            System.out.println("Volume of cuboid : "+cuboid);
            break;
            default :
            System.out.println("Wrong Choice");
        }
    }
}