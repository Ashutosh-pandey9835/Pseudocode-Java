import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // DECLARE n: INTEGER
        // DECLARE SUM: INTEGER
        int n, sum = 0;

        // READ n
        System.out.print("Enter an integer n: ");
        n = scanner.nextInt();
        scanner.close();

        // For i:=1 to n
        for (int i = 1; i <= n; i++) {
            // SUM = SUM + i * i
            sum += i * i;
        }

        // PRINT SUM
        System.out.println("The sum of squares from 1 to " + n + " is: " + sum);
    }
}