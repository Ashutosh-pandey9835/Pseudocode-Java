// START

// SET x = 10
// SET y = 16
// SET z = 3

// IF x > y THEN
//     x = 2 * y
// ELSE
//     y = x / 2
// END IF

// IF z >= y THEN
//     z = 2 * y
// ELSE
//     y = z / 2
// END IF

// PRINT x + y + z

// END
public class Problem2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 16;
        int z = 3;

        if (x > y) {
            x = 2 * y;
        } else {
            y = x / 2;
        }

        if (z >= y) {
            z = 2 * y;
        } else {
            y = z / 2;
        }

        System.out.println(x + y + z);
    }
}