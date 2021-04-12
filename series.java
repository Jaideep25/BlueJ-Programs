class series
{
    public static void main(String args[])
    {
        // 1,4,7,10,...
        int i, n=1;
        for(i=1;i<=10;i++)
        {
            System.out.print(n);
            n=n+3;
        }
        // 1,4,9,16,....
        for(i=1;i<=10;i++)
        {
            System.out.print(i*i+",");
        }
        // 2,5,10,17,.........
        for(i=1;i<=10;i++)
        {
            System.out.print((i*i+1)+",");
        }
        // 3,6,12,24,.......
        n=3;
        for(i=1;i<=10;i++)
        {
            System.out.print(n+" , ");
            n=n*2;
        }
        // 0,3,8,15,........
        for(i=1;i<=10;i++)
        {
            System.out.print((i*i-1)+",");
        }
        //1,-3,5,-7,.......
        int term=1;
        for(i=1;i<=10;i++)
        {
            if(i%2==0)
                System.out.print(-(term)+",");
            else
                System.out.print((term)+",");
            term=term+2;
        }
    }
}