import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class movieMagic {
    int year;
    String title;
    float rating;

    public movieMagic(){
        year = 0;
        title = "";
        rating = 0.0f;
    }
    public void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the title of the movie");
        title = in.nextLine();
        System.out.println("Enter the year of the movie");
        year = in.nextInt();
        System.out.println("Enter the rating of the movie");
        rating = in.nextFloat();
    }
    public void display(){
        String message="Invalid rating";
        if(rating <= 2.0f)
            message = "Flop";
        else if(rating <= 3.4f)
            message = "Semi-Hit";
        else if(rating <= 4.4f)
            message = "Hit";
        else
            message = "Super-hit";
        
        System.out.println("Title of movie : "+title);
        System.out.println("Rating of movie : "+message);
    }
    public static void main(String args[]){
        movieMagic jai = new movieMagic();
        jai.accept();
        jai.display();
    }
}