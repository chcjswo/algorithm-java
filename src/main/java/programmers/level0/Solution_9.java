package programmers.level0;

/**
 * 피자 나눠 먹기 (3)
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-19
 **/
public class Solution_9 {

    public static void main(String[] args) {
        final int solution = solution(7, 10);
        System.out.println("solution = " + solution);
    }

    private static int solution(int slice, int n) {
        return n / slice + (n % slice == 0 ? 0 : 1);
    }
}
