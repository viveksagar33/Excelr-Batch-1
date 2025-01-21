import java.util.Scanner;

public class demo020{

    // Method to determine the output based on the input number
    public static String getFizzBizz(int num) {
        // Check if the input is negative or zero
        if (num <= 0) {
            return "Error";
        }

        // Check if the input is a multiple of both 3 and 5
        if (num % 3 == 0 && num % 5 == 0) {
            return "FIZZBIZZ";
        }
        // Check if the input is a multiple of 3
        else if (num % 3 == 0) {
            return "FIZZ";
        }
        // Check if the input is a multiple of 5
        else if (num % 5 == 0) {
            return "BIZZ";
        }
        // If the number is neither a multiple of 3 nor 5, return the number as a string
        else {
            return Integer.toString(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: A single integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Call the method to get the result and print it
        String result = getFizzBizz(num);
        System.out.println(result);

        scanner.close();
    }
}