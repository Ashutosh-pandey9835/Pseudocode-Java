public class PagemoProblem {
    public static void main(String[] args) {
        int p;
        int q = 13;
        int r;
        
        for (p = 2; p <= 4; p++) {
            r = q % p;
            p = p + 5;
            q = p + r;
        }
        
        r = q + 5; 
        System.out.println(q);
    }
}