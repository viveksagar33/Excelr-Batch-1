import java.util.Scanner;

public class demo021{
    public static void main(String[] args) {
        try (// Create Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in)) {
            // Input: Monthly Gross Salary, HRA, and PF
            System.out.print("Enter monthly gross salary: ");
            double monthlySalary = scanner.nextDouble();

            System.out.print("Enter HRA (House Rent Allowance): ");
            double hra = scanner.nextDouble();

            System.out.print("Enter PF (Provident Fund): ");
            double pf = scanner.nextDouble();

            // Calculate the annual salary
            double annualSalary = monthlySalary * 12;

            // Calculate deductions (HRA + PF)
            double deductions = hra + pf;

            // Calculate taxable income
            double taxableIncome = annualSalary - deductions;

            // Initialize variable for total tax
            double totalTax = 0;

            // Tax calculation based on slabs
            if (taxableIncome <= 500000) {
                totalTax = taxableIncome * 0.10;
            } else if (taxableIncome <= 1000000) {
                totalTax = 50000 + (taxableIncome - 500000) * 0.20; // 50,000 is 10% of 500,000
            } else {
                totalTax = 150000 + (taxableIncome - 1000000) * 0.30; // 150,000 is the tax for income between 500,000 to 1,000,000
            }

            // Display the result
            System.out.println("Annual Salary: " + annualSalary);
            System.out.println("Deductions (HRA + PF): " + deductions);
            System.out.println("Taxable Income: " + taxableIncome);
            System.out.println("Total Tax: " + totalTax);
        }
    }
}

