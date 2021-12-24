/*
Declare a single dimensional array of size 28 to store daily temperatures for the month of February. Using this structure, write a program to find:

The hottest day of the month
The coldest day of the month
The average temperature of the month
*/


import java.util.*;

public class SDA_FebTemp {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double febTemp[] = new double[28];
        int n = febTemp.length;
        
        System.out.println("Enter Feb daily temperatures:");
        for (int i = 0; i < n; i++) {
            febTemp[i] = in.nextDouble();
        }
        
        double sum = 0.0;
        int low = 0, high = 0;
        for (int i = 0; i < n; i++) {
            if (febTemp[i] < febTemp[low])
                low = i;
            
            if (febTemp[i] > febTemp[high])
                high = i;
                
            sum += febTemp[i];
        }
        
        double avg = sum / n;
        
        System.out.println("Hottest day = " + (high + 1));
        System.out.println("Coldest day = " + (low + 1));
        System.out.println("Average Temperature = " + avg);

        in.close();
    }
}