/*
Define a class Telephone having the following description:
Data members/Instance variables :
String name : To store name of the consumer
int call : to store the number of calls made in a month
double charge : to store the charges 
double billAmount : to store the bill amount 
Member methods :
void getData() : to accept the name and no. of class made
void compute() : to find charge according to the conditions given:
Calls made Rate
Up to 100 calls No charge
For the next 200 calls Rs. 1.50
For the next 300 calls Rs. 2.00
Above 600 calls Rs. 3.00
However every consumer has to pay Rs. 200.00 as rent/month for availing the service 
along with the charges as bill amount.
void display() : to display all the details in tabular form.
Define main method, create object of the class and call the member methods.
 */
import java.util.*;
class Telephone
{
    int call;
    double charge = 200, billAmount = 0;
    void getData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of calls made in a month");
        call = in.nextInt();
        in.close();
    }
    void compute(){
        if(call<=100)
            billAmount = call*0+charge;
        else if((call>100)&&(call<=300))
            billAmount = ((call-100)*1.50)+200;
    }
    void display(){
    }
}