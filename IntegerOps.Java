//Integer p,q,r 
// set q = 13
// for(each p from 1 to 4)
// r = q mod p 
// p = p+5
// q = p+r
// END FOR
// r = q/5
// print q,r  


public class IntegerOps {
    public static void main(String[] args) {
        int p, i, z, r;
        int q = 13;
        for (p = 1; p <= 4; p++) {
            r = q % p;
            p = p + 5;
            q = p + r;
        }
        r = q / 5;
        System.out.println(q + " " + r);
    }
}