import java.util.Scanner;

public class FilePath
{
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter full path: ");
        String filepath = in.next();
        
        char pathSep = '\\';
        char dotSep = '.';

        int pathSepIdx = filepath.lastIndexOf(pathSep);
        System.out.println("Path:\t\t" + filepath.substring(0, pathSepIdx));

        int dotIdx = filepath.lastIndexOf(dotSep);
        System.out.println("File Name:\t" + filepath.substring(pathSepIdx + 1, dotIdx));
        
        System.out.println("Extension:\t" + filepath.substring(dotIdx + 1));

        in.close();
    }
}