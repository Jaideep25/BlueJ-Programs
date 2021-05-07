import java.util.*;
class Record_Result {
    String name, grade;
    int total, per;

    void inputData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Enter your total marks scored out of 600");
        total = in.nextInt();
        in.close();
    }
    void calculate(){
        per = (total/600)*100;
        if(per<35)
            grade = "Fail";
        else if((per>=35)&&(per<=49))
            grade = "Third Class";
        else if((per>=50)&&(per<=59))
            grade = "Second Class";
        else if((per>=60)&&(per<=84))
            grade = "Firt Class";
        else if(per>=85)
            grade = "Distinction";
    }
    void display(){
        System.out.println("Your name : "+name);
        System.out.println("Your total marks scored : "+total);
        System.out.println("Your percentage : "+per);
        System.out.println("Your grade : "+grade);
    }
}