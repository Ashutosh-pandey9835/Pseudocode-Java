// Sum the series
// 1+2+3+4+.....+n
// DECLARE n:INTEGER
// DECLARE Sum:INTEGER
// READ n
// SUM:=0
// For i:= 1 to n
// SUM:=SUM+i
// end for 
// print Sum

import java.util.Scanner;

public class SumSeries2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.print("READ n: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("PRINT SUM: " + sum);
        scanner.close();
    }
}