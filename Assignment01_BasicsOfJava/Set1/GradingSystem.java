import java.util.Scanner;

public class GradingSystem {

    public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public static double calculateAverage(int total) {
        return total / 3.0;
    }

    public static char calculateGrade(double average) {
        if (average >= 90)
            return 'A';
        else if (average >= 80)
            return 'B';
        else if (average >= 70)
            return 'C';
        else if (average >= 60)
            return 'D';
        else
            return 'F';
    }

    public static boolean isPass(int m1, int m2, int m3) {
        return m1 >= 40 && m2 >= 40 && m3 >= 40;
    }

    public static void printReport(String name, int roll, int m1, int m2, int m3,
                                   int total, double average, char grade, boolean isPassed) {

        System.out.println("\n--Report Card--");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + (isPassed ? "PASS" : "FAIL"));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.println("Enter marks for 3 subjects (out of 100):");

        System.out.print("Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Subject 3: ");
        int m3 = sc.nextInt();

        int total = calculateTotal(m1, m2, m3);
        double average = calculateAverage(total);

        boolean isPassed = isPass(m1, m2, m3);

        char grade;
        if (!isPassed) {
            grade = 'F';
        } else {
            grade = calculateGrade(average);
        }

        printReport(name, roll, m1, m2, m3, total, average, grade, isPassed);

        sc.close();
    }
}
