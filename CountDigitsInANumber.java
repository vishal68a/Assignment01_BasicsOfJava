import java.util.Scanner;

public class CountDigitsInANumber {

    public static int countDigits(int number) {

        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int digits = countDigits(number);

        System.out.println("Number of digits in " + number + " is: " + digits);

        sc.close();
    }
}
