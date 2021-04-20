import java.util.Scanner;
public class Atransport
{
    String name;
    int w, charge;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name of the customer and weight of the parcel in Kgs");
        name=in.nextLine();
        w=in.nextInt();
        in.close();
    }
    void calculate()
    {
        if(w<=10)
            charge=w*25;
        else if(w>20 && w<=30)
            charge=10*25+(w-10)*20;
        else if(w>30)
            charge=10*25+20*20+(w-30)*10;
        int surcharge=(int)(5.0/100*charge);

        charge=charge+surcharge; 
    }
    void print()
    {
        System.out.println("Name\t\tWeight\t\tBill amount");
        System.out.println(name+"\t\t"+w+"\t\t"+charge);
    }
    public static void main(String args[])
    {
        Atransport cust1=new Atransport();
        cust1.accept();
        cust1.calculate();
        cust1.print();
    }
}