import java.util.Scanner;
class Sales
{
    String salesman_name;
    double sales_value, commission;
    public void acceptData()
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter name of the Salesman and sales value");
        salesman_name=inp.nextLine();
        sales_value=inp.nextDouble();
        inp.close();
    }

    public void calculateCommission()
    {
        if(sales_value<=25000)
            commission=8.0/100*sales_value;
        else if(sales_value>25000 && sales_value<=50000)
            commission=12.0/100*sales_value;
        else if(sales_value>50000 && sales_value<=75000)
            commission=15.0/100*sales_value;
        else if(sales_value>75000)
            commission=20.0/100*sales_value;
    }

    public void displayDetails()
    {
        System.out.println("Name of the Sales man : "+salesman_name);
        System.out.println("Sales value : "+sales_value);
        System.out.println("Commission : "+commission);
    }

    public static void main(String args[])
    {
        Sales sm1=new Sales();
        sm1.acceptData();
        sm1.calculateCommission();
        sm1.displayDetails();
    }
} 