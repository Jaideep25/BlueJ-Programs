// program
class forloop
{
    public static void main(String args[])
    {
        for(int i=5; i>=1; i--)
        {
            //int n=1;
            for(int j=1; j <= i; j++)
            {
                if(j%2==0)
                System.out.print(0+" ");
                else
                System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}