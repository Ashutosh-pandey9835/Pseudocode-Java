// START

// DECLARE a, b, c

// SET c = 12
// SET b = 4

// SET a = c / b

// SET c = b >> a

// PRINT c

// END
public class ValueCalculation {
    public static void main(String[] args) {
        // Declare integer variables a, b, and c
        int a, b, c;

        // Set initial values for c and b
        c = 12;
        b = 4;

        // Perform integer division: a = 12 / 4, so a becomes 3
        a = c / b;

        // Perform right bit shift: c = 4 >> 3
        // In binary, 4 is 100. Shifting right by 3 bits results in 0.
        c = b >> a;

        // Print the final value of c
        System.out.println(c);
    }
}