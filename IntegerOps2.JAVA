//Integer a,b,c
// set a = 7, b= 8,c = 9
// if((a^b^c) < (b+c+a))
// b = 6 + a
// End if 
// a = 8^b
// Print a + b + c

public class IntegerOps {
    public static void main(String[] args) {
        int a, b, c;

        a = 7;
        b = 8;
        c = 9;

        if ((a & b & c) < (b + c + a)) {
            b = 6 + a;
        }


        a = 8 * b;

        int sum = a + b + c;
        System.out.println("The sum a + b + c is: " + sum);
    }
}

