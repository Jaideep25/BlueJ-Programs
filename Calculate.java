/*3. A demo class – Calculate, that illustrate constructor overloading
which finds the sum of two numbers and display. 
This class has 3 public constructors;
(i) Default constructor with some values
(ii) Parameterised constructor with one parameter
(iii) Parameterised constructor with two parameters
And 
 a method; void calSum() to calculate the sum of 2 nos
 another method; void display() to display the sum*/
class Calculate {
    int a, b, c;

    public Calculate() {
        a = 10;
        b = 15;
    }

    public Calculate(int p) {
        a = p;
        b = 4;
    }

    public Calculate(int x, int y) {
        a = x;
        b = y;
    }

    void calSum() {
        c = a + b;
    }

    void display() {
        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }

    public static void main(String args[]) {
        Calculate ob1 = new Calculate();
        ob1.calSum();
        ob1.display();
        Calculate ob2 = new Calculate(8);
        ob2.calSum();
        ob2.display();
        Calculate ob3 = new Calculate(5, 2);
        ob3.calSum();
        ob3.display();
    }
}
