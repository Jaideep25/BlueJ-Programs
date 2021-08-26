import java.util.*;

class RecordPrg14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Enter 1 for S= (1+2) + (1+2+3) + - - - - - - - - - - (1+2+3+ - - - - - - - n) these series \n 2 for  S = a/2!-a/3!+a/4!-a/5!---------a/20! \n 3 for S = 1/a + 2/a^2 + 3/a^3 + 4/a^4 +-------- n/a^n");
        System.out.println("Enter your choice ");
        int ab = in.nextInt();
        in.close();
        switch (ab) {
            case 1: {
                int n, j, s1 = 1, s2 = 0;
                System.out.println("Enter the number");
                n = in.nextInt();
                for (j = 1; j <= n; j++) {
                    s1 = s1 + j;
                    s2 = s2 + s1;
                }
                System.out.println("Sum of the series = " + s2);
                break;
            }
            case 2: {
                System.out.println("Enter the number");
                int a = in.nextInt();
                int i, sign = 1;
                double ans = 0, s = 1, f = 1;
                for (i = 2; i <= 6; i++) {
                    f = f * i;
                    ans = (a / f) * s;
                    s = s + ans;
                    s = sign * -1;
                }
                System.out.println("The sum is = " + s);
                break;
            }
            case 3: {
                int A, i, n;
                double s = 0;
                System.out.println("Enter the number");
                A = in.nextInt();
                System.out.println("Enter the number of times the loop should run");
                n = in.nextInt();
                for (i = 1; i <= n; i++) {
                    s = s + i / Math.pow(A, i);
                }
                System.out.println("Sum of the series is = " + s);
                break;
            }
            default:
                System.out.println("Incorrect choice");
        }
    }
}
