class WrapperClassMethods {
    public static void main(String args[]) {
        String a = "164", b = "51", c = "203.45", d = "96.7784";
        System.out.println("=====================================================");
        System.out.println("=====parseXxx() of Integer, Long, Float & Double=====");
        System.out.println("=====================================================");
        System.out.println("is Upper case of B = " + (Integer.parseInt(a) + 6));
        System.out.println("is Lower case of m = " + (Long.parseLong(b) - 11));
        System.out.println("m in Upper case = " + (Float.parseFloat(c) * 2));
        System.out.println("m in Lower case = " + (Double.parseDouble(d) / 10));
        System.out.println("=====================================================");
        System.out.println("============== Character class methods ============");
        System.out.println("=====================================================");
        char c1 = 'm', c2 = 'B', c3 = '5', c4 = '*', c5 = '\t';
        System.out.println("is Upper case of B = " + Character.isUpperCase(c2));
        System.out.println("is Lower case of m = " + Character.isLowerCase(c1));
        System.out.println("m in Upper case = " + Character.toUpperCase(c1));
        System.out.println("m in Lower case = " + Character.toLowerCase(c1));
        System.out.println("B to Lower case = " + Character.toLowerCase(c2));
        System.out.println("is Letter of m = " + Character.isLetter(c1));
        System.out.println("is Digit of 5 = " + Character.isDigit(c3));
        System.out.println("is LetterOrDigit of * = " + Character.isLetterOrDigit(c4));
        System.out.println("is whitespace of \\t = " + Character.isWhitespace(c5));
        System.out.println("is whitespace of m = " + Character.isWhitespace(c1));
    }
}