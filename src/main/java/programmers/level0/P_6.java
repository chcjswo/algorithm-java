package programmers.level0;

/**
 *
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-18
 **/
public class P_6 {

    public static void main(String[] args) {
        int n = 16;
        final int solution = solution(n);
        System.out.println("solution = " + solution);
    }

    private static int solution(int n) {
        int answer = n / 7;
        return answer + (n % 7 == 0 ? 0 : 1);
    }
}
