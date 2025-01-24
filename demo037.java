
    import java.util.Scanner;

public class demo037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter third number:");
        double num3 = scanner.nextDouble();

        System.out.println("Enter fourth number:");
        double num4 = scanner.nextDouble();

        double biggestNumber = Math.max(Math.max(Math.max(num1, num2), num3), num4);

        System.out.println("The biggest number is: " + biggestNumber);

        scanner.close();
    }
}

