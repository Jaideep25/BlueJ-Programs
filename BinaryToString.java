import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Scanner;

public class BinaryToString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the binary no. to conv to String");
        String input = in.nextLine();
        in.close();
        String raw = Arrays.stream(input.split(" "))
                .map(binary -> Integer.parseInt(binary, 2))
                .map(Character::toString)
                .collect(Collectors.joining()); // cut the space

        System.out.println(raw);

    }

}