import java.util.*;
class Compound_Record {
    double p, t, r, ca, ci;
    void getData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        p = in.nextDouble();
        System.out.println("Enter the time");
        t = in.nextDouble();
        System.out.println("Enter the rate of interest");
        r = in.nextDouble();
        in.close();
    }
    void calculate(){
        ca = p*Math.pow((1+r/100),t);
        ci = ca-p;
    }
    void display(){
        System.out.println("Principal : "+p);
        System.out.println("Compound Interest : "+ci);
        System.out.println("Amount : "+ca);
    }
    public static void main(String args[]){
        Compound_Record jai = new Compound_Record();
        jai.getData();
        jai.calculate();
        jai.display();
    }

}