import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y = 0; // Initialized to 0 as no value is read or assigned
        int z;

        System.out.print("Enter a value for X: ");
        x = scanner.nextInt();

        x = x * x;
        z = x * x * x;

        System.out.println("Y: " + y);
        System.out.println("Z: " + z);

        scanner.close();
    }
}