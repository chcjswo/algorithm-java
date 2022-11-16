package dailycoding;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-16
 **/
public class P_1 {

    public static void main(String[] args) {
        final int gcd = gcd(12, 6);
        System.out.println("gcd = " + gcd);
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }
}
