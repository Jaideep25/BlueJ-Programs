import java.util.*;
class Recordprg13
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int swi;
        System.out.println("Enter \n 1 : 1 4 7 10 ------------- 10 terms \n 2 : 0 1 1 2 3 5 8- - - - - - - (Fibonacci series)");
        swi = in.nextInt();
        switch(swi)
        {
            case 1 :
            int j;
            for(j = 1; j<=28; j=j+3)
            {
                System.out.print(j+"\t");
            }
            break;
            case 2:
            int n1=0,n2=1,n3,i,count=10;    
            System.out.print(n1+" "+n2);//printing 0 and 1    
            for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
            {    
                n3=n1+n2;    
                System.out.print(" "+n3);    
                n1=n2;    
                n2=n3;    
            }
            break;
            default :
            System.out.println("Not a valid option");
        }
    }
}
