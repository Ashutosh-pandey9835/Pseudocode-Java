// START

// DECLARE a, b, c, d, e

// SET a = 50
// SET b = 3
// SET c = 3
// SET e = 0

// WHILE c > 0 DO
//     d = a MOD b
//     e = e + d + a
//     c = c - 1
// END WHILE

// PRINT "The final value of e is: ", e

// END

public class AlgorithmImplementation {
    public static void main(String[] args) {
        // Declare integer variables
        int a, b, c, d, e;

        // Set initial values
        a = 50;
        b = 3;
        c = 3;
        e = 0;

        // While loop condition
        while (c > 0) {
            // Calculate d using the modulo operator (%)
            d = a % b;

            // Update e
            e = e + d + a;

            // Decrement c
            c = c - 1;
        }

        // Print the final value of e
        System.out.println("The final value of e is: " + e);
    }
}