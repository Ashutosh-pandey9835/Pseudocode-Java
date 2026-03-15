// START

// SET X = 0
// SET n = 1

// WHILE n ≠ 100 DO
//     X = X + n
//     n = n + 1
// END WHILE

// PRINT X

// END
public class WhileLoopSum {
    public static void main(String[] args) {
        // 8. Set X to 0;
        int X = 0;
        // Set n to 1;
        int n = 1;

        // while (n != 100)
        while (n != 100) {
            // X = X + n;
            X = X + n;
            // n = n + 1;
            n = n + 1;
        }
        // end while
        // Write X.
        System.out.println(X);
    }
}