// START

// DECLARE x, y, z

// SET x = 4
// SET y = 8
// SET z = 3

// DO
//     PRINT x
//     x = x + y + 1
// WHILE x < 15

// END
public class LoopProgram {
    public static void main(String[] args) {
        // Declare integers x, y, z
        int x, y, z;
        
        // Set values
        x = 4;
        y = 8;
        z = 3; // The variable z is set but not used in the loop logic shown.
        
        // Loop implementation
        do {
            System.out.println(x); // PRINT X
            x = x + y + 1;         // x := x + y + 1
        } while (x < 15);          // WHILE X < 15 loop END DO WHILE
    }
}