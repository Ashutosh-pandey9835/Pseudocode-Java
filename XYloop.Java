// Integer x,y
// set x = 15,y = 12
// y = x - 1 
// do{
//     print x 
//     x = y +(x - 2)
// }
// while(x<40)
// end do while

public class XYLoop {
    public static void main(String[] args) {
        int x = 15;
        int y = 12;

        do {
            System.out.println(x);
            x = y + (x - 2);
        } while (x < 40);
    }
}