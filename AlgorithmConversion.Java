// Integer x
// set x = 259
// if (x equals 0)
// print "0"
// otherwise
//     if (x mod 9 equals 0)
//     print "9"
//     otherwise
//         print x mod 9
//     end if
public class AlgorithmConversion {
    public static void main(String[] args) {
        int X = 259;
        if (X == 0) {
            System.out.println("0");
        } else {
            if (X % 9 == 0) {
                System.out.println("9");
            } else {
                System.out.println(X % 9);
            }
        }
    }
}