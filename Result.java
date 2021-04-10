import java.util.*;
class Result
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name, res="";
        int s1,s2,s3,s4,s5,s6;
        double tot, per;
        System.out.println("Enter name of the student");
        name=in.next();
        System.out.println("Enter 6 subject marks on 100");
        s1=in.nextInt();
        s2=in.nextInt();
        s3=in.nextInt();
        s4=in.nextInt();
        s5=in.nextInt();
        s6=in.nextInt();
        tot=s1+s2+s3+s4+s5+s6;
        per=tot/600*100;
        if(per>=85)
            res="Distinction";
        else if(per>=60 && per<80)
            res="First Class";
        else if(per>=45 && per<60)
            res="Second Class";
        if(per>=40 && per<45)
            res="Pass Class";
        if(per<40)
            res="Promotion not granted";
        System.out.println("Name : "+name);
        System.out.println("Total : "+tot);
        System.out.println("Percentage: "+per);
        System.out.println("Result : "+res);
 }
}