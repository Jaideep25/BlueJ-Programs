/*
Write a program to model a class with the specifications as given below:
Class name : Loan
Data members/Instance variables :
double principal : to store loan amount sanctioned
double rate : to store rate of interest
double time : to store no. of years to repay the loan
double interest : to store the interest
double amount : to store the total loan amount to be paid
Member methods :
void getData() : to accept the inputs required
void compute() : to find interest and amount
Formula : si = ptr/100 amt=p+si
void display() : to display principal, interest and amount
Define main method, create object of the class and call the member methods.
 */
import java.util.*;
class Loan
{
    double principal, rate, time, interest, amount;
    void getData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of loan sanctioned");
        principal = in.nextDouble();
        System.out.println("Enter the rate of interest");
        rate = in.nextDouble();
        System.out.println("Enter the years to repay the loan");
        time = in.nextDouble();
        in.close();
    }
    void compute(){
        interest = (principal*rate*time)/100;
        amount = principal+interest;
    }
    void display(){
        System.out.println("The amount of loan sanctioned : "+principal);
        System.out.println("The interest to be paid : "+interest);
        System.out.println("The total amount to be paid : "+amount);
    }
    void main(String args[]){
        Loan jai = new Loan();
        jai.getData();
        jai.compute();
        jai.display();
    }
}