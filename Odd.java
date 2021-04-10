class Odd
{
    public static void main(String args[])
    {
        int n=1;
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
               System.out.print(n);
            }
            System.out.println();
            n=n+2;
        }
    }
}