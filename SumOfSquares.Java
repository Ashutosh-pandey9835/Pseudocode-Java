// DECLARE n:INTEGER
// DECLARE Sum:INTEGER
// READ n
// SUM:=0
// For i:= 1 to n
// SUM:=SUM+i*i
// end for 
// print Sum

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("Enter a number (n): ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }

        System.out.println("The sum of squares from 1 to " + n + " is: " + sum);
        scanner.close();
    }
}