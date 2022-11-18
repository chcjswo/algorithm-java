package programmers.level0;

/**
 * 피자 나눠 먹기 (3)
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-18
 **/
public class P_9 {

    public static void main(String[] args) {
        int solution = solution(4, 12);
        System.out.println("solution = " + solution);
    }

    private static int solution(int slice, int n) {
        int gcd = getGcd(slice, n);
        System.out.println("gcd = " + gcd);
        int lcm = lcm(slice, n, gcd);
        System.out.println("lcm = " + lcm);
        int answer = 0;
        return answer;
    }

    private static int getGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGcd(b, a % b);
    }

    private static int lcm(int a, int b, int gcd) {
        return a * b / gcd;
    }
}
