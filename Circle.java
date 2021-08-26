import java.util.*;

class Circle {
    double r, a, c;

    void input() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        r = x.nextDouble();
        x.close();
    }

    void calculate() {
        a = 22.0 / 7 * r * r;
        c = 2 * 22.0 / 7 * r;
    }

    void display() {
        System.out.println("Area of the circle=" + a);
        System.out.println("Circumference of the circle=" + c);
    }

    public static void main(String args[]) {
        Circle c1 = new Circle();
        c1.input();
        c1.calculate();
        c1.display();
    }
}