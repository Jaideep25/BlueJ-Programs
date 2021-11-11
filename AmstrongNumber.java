class AmstrongNumber {
    public static void main(int n) {
        int x;
        x = n;
        int D, sum = 0;
        while (n > 0) {
            D = n % 10;
            System.out.println(D);
            sum = sum + D * D * D;
            System.out.println(sum);
            n = n / 10;
            System.out.println(n);
        }
        if (sum == x)
            System.out.println("The number is an Amstrong number");
        else
            System.out.println("The number is not an amstrong number");
    }
}