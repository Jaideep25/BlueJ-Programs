
/*
Define a class Discount with the following description:
Data members :
String name : to store name of the customer
double cost : to store cost price of the article purchsed
double dis : to store the discount.
double amt : to store the amount to be paid after discount
Member methods:
Write a program to compute the discount according to the given conditions and display the 
output in the given format:
void input() - to accept the name of the customer and the cost price of the article purchased
void calculate() - to calculate discount as per the criteria given below :
Cost price Discount Rate
Up to Rs. 5000 No discount
From Rs. 5001 to Rs. 10000 10% of the cost price
From Rs. 10001 to Rs. 20000 15% of the cost price
Above Rs. 20000 20% of the cost price
void display() – to display the output in the following format : 
Output :
Name of the customer Cost price Discount Amount to be paid
xxxx xxxx xxxx xxxx
Define main method, create object and call the member methods.
 */
import java.util.*;

class Discount_UserDefined {
    String name;
    double cost, dis, amt;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name ");
        name = in.nextLine();
        System.out.println("Cost price of the article purchased");
        cost = in.nextInt();
        in.close();
    }

    void calculate() {

    }
}