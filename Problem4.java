// START

// SET p = 4
// SET q = 2
// SET r = 1

// SET s = (p AND q) OR (r + 1)

// PRINT s

// END
public class Problem4 {
    public static void main(String[] args) {
        int p = 4;
        int q = 2;
        int r = 1;
        int s = (p & q) | (r + 1);
        System.out.println(s);
    }
}