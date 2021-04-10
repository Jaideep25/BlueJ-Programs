class MathFunctions
{
    public static void main(String args[])
    {
        int p=4, q=3;int a=81, b=100, c=125, d=729;
        double x=35.89612, y=806.24, z=110.5;
        System.out.println("Square root of "+a+" = "+Math.sqrt(a));
        System.out.println("Square root of "+b+" = "+Math.sqrt(b));
        System.out.println("Square root of "+a+" = "+Math.cbrt(c));
        System.out.println("Square root of "+b+" = "+Math.cbrt(d));
        System.out.println(p+"^"+q+" = "+Math.pow(p, q));
        System.out.println("Maximum of "+a+" & "+b+"="+Math.max(a,b));
        System.out.println("minimum of "+x+ " & "+y+"="+Math.min(x,y));
        System.out.println("==========================================================");
        System.out.println("Absolute value of (-1.0/p)="+Math.abs(-1.0/p));
        System.out.println("Absolute value of (x)="+Math.abs(100-105));
        System.out.println("Absolute value of (y)="+Math.abs(y));
        System.out.println("Rounded value of "+x+" = "+Math.round(x));
        System.out.println("Rounded value of "+y+" = "+Math.round(y));
        System.out.println("==========================================================");
        System.out.println("Rounded value down, to the nearest integer = "+Math.floor(x));
        System.out.println("Rounded value up, to the nearest integer = "+Math.ceil(x));
        System.out.println("==========================================================");
        System.out.println("Random number-1 = "+Math.random());
        System.out.println("Random number-2 = "+Math.random());
        System.out.println("Random number-3 = "+Math.random());
        System.out.println("Random number-4 = "+Math.random());
        System.out.println("==========================================================");
        /*for(int i=1;i<=5;i++){
            System.out.println("Random number-"+i+" = "+((int)(Math.random()*6 )+1 ));
        }*/
    }
}