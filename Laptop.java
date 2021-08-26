/*4. An electronics shop has announced the special discount on purchase of Laptops as given below:
Category Discount on Laptop
Up to Rs. 25000 5%
Rs. 25001 – Rs. 50000 7.5%
Rs. 50001 – Rs. 100000 10%
More than Rs. 100000 15%
Define a class Laptop described as below:
Data Members/Instance Variables : name, price, dis, amt
Member Methods:
a) default constructor to initialize the data members with default values.
b) parameterized constructor to initialize the data members. 
c) method to accept the details.
d) method to compute the discount and amount to be paid after discount.
d) method to display the name, discount and amount to be paid after discount.
Write main method to create object of the class and call the methods. */

import java.util.*;

class Laptop {
    String name;
    double price, dis, amt;

    Laptop() {
        name = null;
        price = 0.0;
        dis = 0.0;
        amt = 0.0;
    }

    Laptop(String n, double p) {
        name = n;
        price = p;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name and price");
        name = in.next();
        price = in.nextDouble();
        in.close();
    }

    void compute() {
        if (price <= 25000)
            dis = 5.0 / 100 * price;
        else if (price > 25000 && price <= 50000)
            dis = 7.5 / 100 * price;
        else if (price > 50000 && price <= 100000)
            dis = 10.0 / 100 * price;
        else if (price > 100000)
            dis = 15.0 / 100 * price;
        amt = price - dis;
    }

    void display() {
        System.out.println("Name\tDiscount\tAmount");
        System.out.println(name + "\t" + dis + "\t\t" + amt);
    }

    public static void main(String args[]) {
        Laptop LP1 = new Laptop();
        LP1.input();
        LP1.compute();
        LP1.display();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name and price");
        String n1 = in.next();
        double p1 = in.nextDouble();

        Laptop LP2 = new Laptop(n1, p1);
        LP2.compute();
        LP2.display();
        in.close();
    }
} // End of class-Laptop
