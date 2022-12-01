import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = scanner.nextLine();

        System.out.println("you entered: " + "\"" + input + "\"");

        if (StringUtils.isNumeric(input)) {
            System.out.println(input + " is a number.");
        } else {
            System.out.println(input + " is not a number.");
        }

        System.out.println("flipped case: " + StringUtils.swapCase(input));
        System.out.println("reversed: " + StringUtils.reverse(input));
    }

}

