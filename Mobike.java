/*
Define a class Mobike with the following specifications:
Instance variables/Data members :
String name : to store name of the customer 
int phno : to store phone number of the customer
int bno : to store the bike number
int days : to store the number of days the bike is taken out for rent
int charge : to calculate and store the rental charge
Member methods:
void input() : to input and store details of the customer
void compute() : to compute the rental charge on the following basis:
For first 5 days - Rs. 500/day
For next 5 days - Rs. 400/day
Rest of the days - Rs. 300/day
void display() : to display the details in the following format:
Bike no. Phone No. Name No. of Days Charge
xxxx xxxx xxxx xxxx xxxx
Write main method, create object of the class and invoke the member methods
 */
import java.util.*;
class Mobike
{
    String name;
    int phno, bno, days, charge;
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Your name??");
        name = in.nextLine();
        System.out.println("Enter your phone number");
        phno = in.nextInt();
        System.out.println("Enter the bike number");
        bno = in.nextInt();
        System.out.println("Enter the number of days the bike has been taken out for rent");
        days = in.nextInt();
    }
    void compute(){
        if(days<=5)
            charge = 500*days;
        else if((days>5)&&(days<=10))
            charge = (5*500)+((days-5)*400);
        else if(days>10)
            charge = (5*500)+(5*400)+((days-10)*300);
    }
    void display(){
        System.out.println("Your bike number is : "+bno);
        System.out.println("Your phone number is : "+phno);
        System.out.println("Youe name is : "+name);
        System.out.println("The amount to be paid by you for the rent of the bike is : "+charge);
    }
    void main(String args[]){
        Mobike jai = new Mobike();
        jai.input();
        jai.compute();
        jai.display();
    }
}