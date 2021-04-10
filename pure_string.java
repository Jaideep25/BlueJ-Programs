import java.util.*;
class pure_string
{
    public static void main(String args[])
    {
        String a = "Computer";
        String b = "Program";
        String c = " Knowledge";
        String d = c.trim();
        System.out.println("Computer in uppercase = "+a.toUpperCase());
        System.out.println("Program in lowercase = "+b.toLowerCase());
        System.out.println("Removing spaces on both sides of Knowledge after trim() = "+d);
        System.out.println("Length of Java after trim() = "+d.length());
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("A equals to B = "+a.equals(b));
        System.out.println("A equals to B, ignoring cases = "+a.equalsIgnoreCase(b));
        System.out.println("Computer starts with COM = "+a.startsWith("COM"));
        System.out.println("Computer ends with TER = "+a.endsWith("TER"));
        System.out.println("A compare to B = "+a.compareTo(b));
        System.out.println("A compare to B = "+a.compareTo("COMPUTER"));
        System.out.println("A compare to B = "+a.compareToIgnoreCase("COMPUTER"));
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Replacing m with * in Computer = "+a.replace('m','*'));
        System.out.println("Character at index 3 in Program = "+b.charAt(3));
        System.out.println("Index of g in program = "+b.indexOf('g'));
        System.out.println("Index of 1st occurance of r in  program = "+b.indexOf('r'));
        System.out.println("Index of r in program after index 2 = "+b.indexOf('r',2));
        System.out.println("Index of last occourance of r in program = "+b.lastIndexOf('r'));
        System.out.println("Adding A&B = "+a.concat(b));
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Extracting gram from program = "+b.substring(3));
        System.out.println("Extracting og from program = "+b.substring(2,4));
        System.out.println("Extracting now from Knowledge = "+d.substring(1,4));
        System.out.println("Extracting edge from Knowledge = "+d.substring(5));
        System.out.println("-------------------------------------------------------------------------------------");
    }
}