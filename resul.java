
import java.util.Scanner;
public class resul
{
    String name, grade;
    int total;
    double per;
    public void inputData()
    {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the name and total marks scored out of 600");
        name = z.nextLine();
        total = z.nextInt();
        z.close();
    }
    public void calculate()
    {
        per=(total/600)*100;
        System.out.println(per);
        if(per>=85)
            grade = "Distinction";
        else if(per>=60 && per<85)
            grade = "First Class";
        else if(per>=50 && per<60)
            grade = "Second Class";
        else if(per>=35 && per<50)
            grade = "Third Class";
        else
            grade = "Fail";
    }
    public void display()
    {
        System.out.println("************************************");
        System.out.println("Name:         "+name);
        System.out.println("Percentage    "+per);
        System.out.println("Grade         "+grade);
        System.out.println("************************************");
    }
    public static void main (String args[])
    {
        resul stud = new resul();
        stud.inputData();
        stud.calculate();
        stud.display();
    }
}
         
