import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, d, cnt = 0, r;

        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        System.out.print("Enter the digit to count: ");
        d = scanner.nextInt();

        while (num > 0) {
            r = num % 10;
            num = num / 10;
            if (r == d) {
                cnt++;
            }
        }

        System.out.println("The digit " + d + " appears " + cnt + " times.");
        scanner.close();
    }
}