// Set a = 4,b = 4, c = 4
// if (a &(b^b)&c)
// a = a>>1
// end if 
// print a + b + c
public class CodeSnippet {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;

        if ((a & (b ^ b) & c) != 0) {
            a = a >> 1;
        }

        System.out.println(a + b + c);
    }
}