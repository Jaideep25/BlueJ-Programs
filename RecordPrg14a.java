class RecordPrg14a
{
    public static void main(String args[])
    {
        int n = 0,sum,sum1=0,i,j;

        System.out.println("\nEnter value for n = ");
        //System.out.println("%d",n);
 
        for(i=1;i<=n;i++)
        {
                sum=0;
                for(j=1;j<=i;j++)
                {
                    sum=sum+j;
                }
                sum1=sum1+sum;
        }
        //System.out.println("\nThe Sum of Series up to Value [ %d ] = [ %d ]\n",n,sum1);
    }
}