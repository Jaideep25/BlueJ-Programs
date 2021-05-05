import java.util.*;
class Agilenetwork_Record{
    String name;
    int speed;
    double amount;
    void accept(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name and speed");
        name=in.next();
        speed=in.nextInt();
        in.close();
    }
    void calculate(){
        if(speed==200)
            amount=275.00*12;
        else if(speed==300)
            amount=500*12;
        else if(speed==500)
            amount=750*12;
        amount += 1000;
    }  
    void display(){
         System.out.println("Name \t Speed \t Amount");
         System.out.println(name + " \t "+ speed + " \t " + amount);
        }
        public static void main(String args[]){
            Agilenetwork_Record  jai = new Agilenetwork_Record();
            jai.accept();
            jai.calculate();
            jai.display();
        }
    }