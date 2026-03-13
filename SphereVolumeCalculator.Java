import java.util.Scanner;

public class SphereVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius, volume;
        final double PI = 3.14;

        System.out.print("Enter Radius: ");
        radius = scanner.nextDouble();

        volume = (4.0/3.0) * PI * radius * radius * radius;

        System.out.println("Volume: " + volume);
    }
}