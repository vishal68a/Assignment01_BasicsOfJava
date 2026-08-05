import java.util.Scanner;

public class ElectricityBillCalculator {

    public static double calculateBill(int units) {

        if (units <= 100) {
            return units * 1.5;
        } else if (units <= 300) {
            return units * 2.5;
        } else if (units <= 500) {
            return units * 4.0;
        } else {
            return units * 6.0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int customerId;
        String customerName;
        int units;
        double billAmount;

        System.out.print("Enter Customer ID: ");
        customerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        units = sc.nextInt();

        billAmount = calculateBill(units);

        System.out.println("\nElectricity Bill:");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.printf("Total Bill: Rs%.2f%n", billAmount);

        sc.close();
    }
}
