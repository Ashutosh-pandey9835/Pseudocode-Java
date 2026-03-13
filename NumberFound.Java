import java.util.Scanner;

public class NumberFound {
    public static void main(String[] args) {
        // DECLARE num: INTEGER, d: INTEGER, r: INTEGER
        // DECLARE found: BOOLEAN
        int num, d, r;
        boolean found = false;

        Scanner scanner = new Scanner(System.in);

        // READ NUM
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        // READ d
        System.out.print("Enter a digit to search: ");
        d = scanner.nextInt();

        // WHILE num > 0
        while (num > 0) {
            // r = num MOD 10
            r = num % 10;
            // num = num / 10
            num = num / 10;

            // IF r == d THEN
            if (r == d) {
                // found := TRUE
                found = true;
                // BREAK
                break;
            }
            // ENDIF
        }
        // END WHILE

        // IF found == TRUE THEN
        if (found) {
            // PRINT "Search Successfully"
            System.out.println("Search Successfully");
        } else {
            // PRINT "Not Search Successfully"
            System.out.println("Not Search Successfully");
        }
        // END IF

        scanner.close();
    }
}