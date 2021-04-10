class exp
{
    public static void main(String args[])
    {
        int k=8, m=11, r=7;
        k+= --m % 4 *(m++ *(10 - r++));
        System.out.println(k);
    }
}