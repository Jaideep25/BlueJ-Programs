import java.util.Scanner;

public class Factorial {
    public int fact(int z){
        int fact = 1;
        for(int i=1; i<=z; i++)
            fact *= i;
        return fact;
    }
    public static void main(String arrgs[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = in.nextInt();
        int l=2;
        double tot=0;
        Factorial jai = new Factorial();
        for(int i =1; i<=10; i++){
            tot += Math.pow(a,l)/jai.fact(i);
            l+=2;
        }
        System.out.print("Sum of series : "+tot);
    }
}
