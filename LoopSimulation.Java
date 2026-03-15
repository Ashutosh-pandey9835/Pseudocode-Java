// START

// DECLARE a, b, c

// SET b = 0
// SET c = 0

// FOR a = 1 TO 5 DO
//     PRINT c
//     b = b + 1
//     c = c + b
// END FOR

// END
public class LoopSimulation {
    public static void main(String[] args) {
        // Integer a, b, c
        int a, b, c;
        // Set b:=0, c=0
        b = 0;
        c = 0;

        // For each a from 1 to 5 loop
        for (a = 1; a <= 5; a++) {
            // PRINT C
            System.out.println(c);
            // b: b+1
            b = b + 1;
            // c: c+b
            c = c + b;
        }
        // NEXT a
    }
}