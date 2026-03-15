// SET p = 3
// SET q = 8
// SET r = 1

// SET sum = p + q + r

// IF (p ≠ 0) AND (sum = 11) AND (q = 4) AND (r ≠ 0) THEN
//     PRINT "Success"
// ELSE
//     PRINT "Fail"
// END IF

// END

public class ConditionCheck {
    public static void main(String[] args) {
        // Input p=3, q=8, r=1
        int p = 3;
        int q = 8;
        int r = 1;
        int sum;

        // Set Sum = p + q + r
        sum = p + q + r;

        // The if condition check
        if ((p != 0) && (sum == 11) && (q == 4) && (r != 0)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}