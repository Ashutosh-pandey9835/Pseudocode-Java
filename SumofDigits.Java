import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r, sum = 0;
        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r;
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}