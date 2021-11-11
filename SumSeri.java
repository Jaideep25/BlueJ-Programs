class SumSeri
{
    public static long fact( int  a )  
    {
       long f=1 ;
        for(int i=1;i<=a;i++)
        {   
            f*=i;
        }
        return f ;
    }

    public static void main(String args[])
    {
        double sum=0 ;
        int n=1;
        for(int i=1 ;i<=10; i++ )
        {
            sum=sum+ (double)n / fact(i) ;                       
            n=n+2 ;
        }
        System.out.println("Sum ="+sum);
    }
}