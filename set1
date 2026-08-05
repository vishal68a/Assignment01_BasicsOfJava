import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int accountNumber;
        String customerName;
        boolean isActive;
        double principal;
        double rate;
        int time;
        double interest;

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter customer name: ");
        customerName = sc.nextLine();

        System.out.print("Is account active (true/false): ");
        isActive = sc.nextBoolean();

        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        rate = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        time = sc.nextInt();

        interest = (principal * rate * time) / 100;

        System.out.println("\nInterest Details:");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Active: " + isActive);
        System.out.printf("Principal Amount: %.1f%n", principal);
        System.out.printf("Rate of Interest: %.1f%%%n", rate);
        System.out.println("Time (years): " + time);
        System.out.printf("Simple Interest: %.1f%n", interest);

        sc.close();
    }
}
