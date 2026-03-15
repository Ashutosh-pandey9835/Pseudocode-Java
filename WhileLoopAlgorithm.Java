// START

// SET a = 2
// SET b = 50

// WHILE b > 0 DO
//     a = (b MOD 2) + a

//     IF (a MOD 3 = 0) THEN
//         PRINT a
//     ELSE
//         PRINT (b - 1)
//     END IF

//     b = b / 5
//     a = a + 1
// END WHILE

// END

public class WhileLoopAlgorithm {
    public static void main(String[] args) {
        int a = 2;
        int b = 50;

        while (b > 0) {
            a = b % 2 + a;
            if (a % 3 == 0) {
                System.out.println(a);
            } else {
                System.out.println(b - 1);
            }
            b = b / 5;
            a = a + 1;
        }
    }
}