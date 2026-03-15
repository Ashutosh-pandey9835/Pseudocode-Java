// START

// DECLARE a, b, c, d

// SET b = 10
// SET c = 0

// SET a = b - c

// FOR c = 2 TO a DO
//     b = b + c + 10
//     b = b / 2
// END FOR

// SET c = a + b + c

// PRINT a, b, c

// END
public class Problem5 {
    public static void main(String[] args) {
        int a, b, c, d;
        b = 10;
        // The value of c is not initialized before being used in the next line.
        // Assuming c has some initial value, e.g., 0 for demonstration.
        c = 0; // Assumption
        a = b - c;

        for (c = 2; c <= a; c++) {
            b = b + c + 10;
            // The line 'b := b/2' likely means b = b / 2;
            b = b / 2;
        }
        c = a + b + c;
        System.out.println(a + " " + b + " " + c);
    }
}