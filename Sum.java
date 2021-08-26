class Sum {
    public static void printSum(int n) { // 1st Part
        int total = 0;
        for (int i = 1; i <= n; i++)
            total += i;
        System.out.println("Sum : " + total);
    }

    public static void printSum(int a, int b) {
        int total = 0;
        for (int i = a; i <= b; i++)
            total += i;
        System.out.println("Sum : " + total);
    }

    public static void printSum() {
        double total = 0;
        for (int i = 10; i <= 20; i++)
            total += i;
        System.out.println("Sum : " + total / 10);
    }
}