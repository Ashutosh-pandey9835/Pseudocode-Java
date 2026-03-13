import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // DECLARE x, y, z : INTEGER
        int x, y, z;

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // READ x //INPUT x
        System.out.print("Enter first number (x): ");
        x = scanner.nextInt();

        // READ y //INPUT y
        System.out.print("Enter second number (y): ");
        y = scanner.nextInt();

        // z : x + y // z = x + y
        z = x + y;

        // PRINT z
        System.out.println("The sum is: " + z);

        scanner.close();
    }
}