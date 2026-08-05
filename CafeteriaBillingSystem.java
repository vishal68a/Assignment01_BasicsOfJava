import java.util.Scanner;

public class CafeteriaBillingSystem {

    public static double calculateSubtotal(int itemNumber, int quantity) {

        switch (itemNumber) {
            case 1:
                return quantity * 50.0;

            case 2:
                return quantity * 70.0;

            case 3:
                return quantity * 100.0;

            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int itemNumber;
        int quantity;
        double subtotal;
        double totalBill = 0;

        do {

            System.out.println("\n----- Cafeteria Menu -----");
            System.out.println("1. Coffee - Rs50");
            System.out.println("2. Sandwich - Rs70");
            System.out.println("3. Burger - Rs100");
            System.out.println("0. Exit");

            System.out.print("Enter item number (0 to finish): ");
            itemNumber = sc.nextInt();

            if (itemNumber == 0) {
                break;
            }

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            subtotal = calculateSubtotal(itemNumber, quantity);

            switch (itemNumber) {
                case 1:
                    System.out.println("Subtotal for Coffee (x" + quantity + "): Rs" + subtotal);
                    break;

                case 2:
                    System.out.println("Subtotal for Sandwich (x" + quantity + "): Rs" + subtotal);
                    break;

                case 3:
                    System.out.println("Subtotal for Burger (x" + quantity + "): Rs" + subtotal);
                    break;

                default:
                    System.out.println("Invalid Item!");
            }

            totalBill += subtotal;

        } while (true);

        System.out.printf("Total Bill: Rs%.2f%n", totalBill);

        sc.close();
    }
}
