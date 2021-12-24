import java.util.Scanner;

public class SingleDimensionalArrayStudent
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        
        int name[] = new int[n];
        int totalmarks[] = new int[n];
        for (int i = 0; i < n; i++) {
            in.nextLine();
            //System.out.print("Enter name of student " + (i+1) + ": ");
            //name[i] = in.nextInt();
            System.out.print("Enter total marks of student " + (i+1) + ": ");
            totalmarks[i] = in.nextInt();
            name[i]=i;
        }
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (totalmarks[j] > totalmarks[index])
                    index = j;
            }
            int t = totalmarks[i];
            totalmarks[i] = totalmarks[index];
            totalmarks[index] = t;
            
            t = name[i];
            name[i] = name[index];
            name[index] = t;
        }
        
        //Display sorted total hours
        for (int i = 0; i < n; i++)
            System.out.println("Student " + (name[i]+1) 
                + "\t" + totalmarks[i]);
        in.close();
    }
}