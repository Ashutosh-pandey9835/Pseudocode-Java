import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
int n, prev = 0, next = 1, sum;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the limit n: ");
n = scanner.nextInt();
System.out.println(prev);
System.out.println(next);
sum = prev + next;
while (sum <= n) {
System.out.println(sum);
prev = next;
next = sum;
sum = prev + next;
}
scanner.close();
}
}