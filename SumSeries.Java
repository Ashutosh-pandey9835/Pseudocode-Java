import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        int n;
        int Sum = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer n: ");
        n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            Sum = Sum + i;
        }
        
        System.out.println("The sum is: " + Sum);
        scanner.close();
    }
}