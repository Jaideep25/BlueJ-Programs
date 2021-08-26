
/*Write a class with the following specifications:
Class name : Rectangle
Data members/Instance variables :
int length, int breadth, double area, double perimeter and double diagonal
Member methods:
void inputData() - to input length and breadth of the rectangle
void calculate() - to calculate area, perimeter & diagonal of the rectangle
area = length x breadth, perimeter = 2(length+breadth) & diagonal = √𝑙𝑒𝑛𝑔𝑡ℎ
2 + 𝑏𝑟𝑒𝑎𝑑𝑡ℎ
2
void outputData() - to print the calculated results.
Define main method, create object and call the member methods.
*/
import java.util.*;

class Rectangle {
    double length, breadth, area, perimeter, diagonal;

    void inputData() {
        Scanner in = new Scanner(System.in);
        length = in.nextDouble();
        breadth = in.nextDouble();
        in.close();
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
        diagonal = Math.sqrt((length * length) + (breadth * breadth));
    }

    void outputData() {
        System.out.println("Area of the rectangle : " + area);
        System.out.println("Perimeter of the rectangle : " + perimeter);
        System.out.println("Length of Diagonal of the rectangle : " + diagonal);
    }

    void main(String args[]) {
        Rectangle jai = new Rectangle();
        jai.inputData();
        jai.calculate();
        jai.outputData();
    }
}