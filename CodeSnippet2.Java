// START

// SET x = 10
// SET y = 16
// SET z = 3

// IF x > y THEN
//     x = y
// ELSE
//     y = x
// END IF

// IF z >= y THEN
//     z = y
// ELSE
//     y = z
// END IF

// PRINT x + y + z

// END
public class CodeSnippet2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 16;
        int z = 3;

        if (x > y) {
            x = y;
        } else {
            y = x;
        }

        if (z >= y) {
            z = y;
        } else {
            y = z;
        }

        System.out.println(x + y + z);
    }
}