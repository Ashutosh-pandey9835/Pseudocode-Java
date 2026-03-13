import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int n = scanner.nextInt();
        int originalNumber = n;
        int sum = 0;
        int remainder;
        while (n != 0) {
            remainder = n % 10;
            sum += Math.pow(remainder, 3); // Sum = Sum + remainder^3
            n /= 10; // Equivalent to n = n / 10
        }
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number.");
        }
        scanner.close();
    }
}