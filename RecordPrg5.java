
class RecordPrg5
{
    public static void main(String args[])
    {
        double w=7, l=12;
        double area, perimeter, diagonal;
        area = w*l;
        perimeter = 2*(w+l);
        diagonal = Math.sqrt((w*w)+(l*l));
        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);
        System.out.println("Diagonal = "+diagonal);
    }
}