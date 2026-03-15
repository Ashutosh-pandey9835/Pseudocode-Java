// Integer x,y,z
// SET x = 8
// SET y = 6
// SET z = 4

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

public class problem3 {
    public static void main(String[] args) {
        int x = 8;
        int y = 6;
        int z = 4;

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