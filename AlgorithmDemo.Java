// A. Integer a, b, c
// Set a=2, b=5, C=10
// for (each c from 3 to 6)
// a = (a+a)+a
// a = (a*a)+c 
// End For
// b = (9+7)+a
// Print (a+b)
public class AlgorithmDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 5;
        c = 10;

        for (c = 3; c <= 6; c++) {
            a = a + a + a; 

            a = (a * a) + c; 
        }

        b = (9 + 7) + a;

        System.out.println(a + b);
    }
}
