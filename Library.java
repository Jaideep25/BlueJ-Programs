import java.util.Scanner;
class Library
{
    int acc_num;
    String title, author;
    Scanner in=new Scanner(System.in); //declared here as input is required in input() & compute()
    void input()
    {
        System.out.println("Enter title"); 
        title = in.nextLine(); 
        System.out.println("Enter author: ");
        author = in.nextLine();
        System.out.println("Enter accession number"); 
        acc_num =in.nextInt(); 
    } 
    void compute()
    {
        int daysLate; 
        double fine;
        System.out.println("Enter number of days late"); 
        daysLate = in.nextInt();
        fine = 2 * daysLate;
        System.out.println("Fine = Rs. " + fine); 
    } 
    void display() 
    {
        System.out.println("Accession Number\tTitle\tAuthor"); 
        System.out.println(acc_num + "\t" + title + "\t" + author);
    }
    public static void main(String args[]) 
    {
        Library book1 = new Library();
        book1.input(); 
        book1.compute();
        book1.display();
    } 
} 