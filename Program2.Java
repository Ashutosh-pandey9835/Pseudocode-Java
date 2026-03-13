import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int square;
        int cube;

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        square = num * num;
        cube = num * num * num;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);

        scanner.close();
    }
}