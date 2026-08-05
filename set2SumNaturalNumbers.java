import java.util.Scanner;

public class SumNaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.print("Enter a positive integer: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}
