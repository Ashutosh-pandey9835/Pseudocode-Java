// Integer value,n
// set value=1,n=45
// while(value less than equal to n)value<=r
// value = value << 1
// end Loop
// print value
public class ValueLoop {
    public static void main(String[] args) {
        int n = 45;
        int value = 1;

        while (value <= n) {
            value = value * 2; // Equivalent to value = value << 1;
        }

        System.out.println(value);
    }
}