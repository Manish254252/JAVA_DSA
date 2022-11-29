import java.util.Scanner;

/**
 * Arrays
 */
public class Arrays {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.nextLine();
            if (str.contains("m")) {
                System.out.println("there is a char");
            } else {
                System.out.println("There is no Char 'm'");
            }
        }

    }

}
// test to add new add and commit