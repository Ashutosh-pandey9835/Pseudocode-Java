import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 0;
        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        while (n > 0) {
            n = n / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}