import java.util.Scanner;

public class Demo059 {
    public static void main(String[] args) {
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}