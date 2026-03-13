import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a palindrome: ");
        int n = scanner.nextInt();
        int originalNumber = n;
        int reversedNumber = 0;
        int remainder;
        while (n != 0) {
            remainder = n % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            n /= 10; // Equivalent to n = n / 10
        }
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome Number.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome Number.");
        }
        scanner.close();
    }
}