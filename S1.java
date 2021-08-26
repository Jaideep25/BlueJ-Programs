class S1 {
    public static void main(String args[]) {
        int i, t = 2;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.print(-t + " ");
            else
                System.out.print(t + " ");
            t = t + 2;
        }
    }
}