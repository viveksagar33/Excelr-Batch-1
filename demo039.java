import java.util.Scanner;

public class demo039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        char character = scanner.next().charAt(0);

        if (character >= 'a' && character <= 'z') {
            System.out.println(character + " is a lowercase letter.");
        } else if (character >= 'A' && character <= 'Z') {
            System.out.println(character + " is an uppercase letter.");
        } else if (character >= '0' && character <= '9') {
            System.out.println(character + " is a digit.");
        } else {
            System.out.println(character + " is a special character.");
        }

        scanner.close();
    }
}