// Q. Integer p, q, r
// Set p=6, q=3, r=5
// q = 1 + r
// q = 5 + q
// IF (5 < r OR (p + q) > (r - p))
// p = (9 + 7) + p
// q = 5 + q
// End if
// print (p + q + r)
public class Problem1 {
    public static void main(String[] args) {
       
        int p, q, r;

        p = 6;
        q = 3;
        r = 5;

        q = 1 + r;

        q = 5 + q;

        if (5 < r || (p + q) > (r - p)) {
            p = (9 + 7) + p;
            q = 5 + q;
        }

        System.out.println(p + q + r);
    }
}
