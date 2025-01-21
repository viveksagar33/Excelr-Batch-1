import java.util.Scanner;

public class demo019 {

    // Method to generate and return Fibonacci sequence
    public static void getFibonacciSeries(int n) {
        // If the input is zero or negative, print 0
        if (n <= 0) {
            System.out.println(0);
            return;
        }

        // Initialize first two Fibonacci numbers
        int first = 0, second = 1;

        // Print the Fibonacci sequence for the first n terms
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(first);  // First number (0)
            } else if (i == 1) {
                System.out.print(", " + second);  // Second number (1)
            } else {
                // Fibonacci number calculation
                int next = first + second;
                System.out.print(", " + next);
                first = second;
                second = next;
            }
        }
        System.out.println();  // Move to the next line after printing the series
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Number of terms for Fibonacci sequence
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        // Call the method to print Fibonacci series
        getFibonacciSeries(n);
        
        scanner.close();
    }
}