public class Paper2009 {
    public void num_calc(int num, char ch) {
        if (ch == 's') {
            int square = num * num;
            System.out.println("The square of the number is = " + square);
        } else {
            int cube = num * num * num;
            System.out.println("The cube of the number is =  " + cube);
        }
    }

    public void num_calc(int a, int b, char ch) {
        if (ch == 'p') {
            int product = a * b;
            System.out.println("The product of the two numbers is = " + product);
        } else {
            int sum = a + b;
            System.out.println("The sum of the two number is = " + sum);
        }
    }

    public void num_calc(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two strings are not equal");
        }
    }
}