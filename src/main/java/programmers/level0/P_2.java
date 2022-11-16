package programmers.level0;

import java.util.Arrays;

/**
 * 코딩테스트 > 연습 코딩테스트 입문 > 분수의 덧셈
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-16
 **/
public class P_2 {

    public static void main(String[] args) {
        final int[] solution = solution(1, 2, 3, 4);
        Arrays.stream(solution).forEach(s -> System.out.println("s = " + s));
    }

    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] sum = {denum1 * num2, num1 * num2, num1 * denum2, num1 * num2};
        Arrays.stream(sum).forEach(s -> System.out.println("s = " + s));
        int[] result = {sum[0] + sum[2], sum[1]};
        final int gcd = gcd(result[0], result[1]);

        int[] answer = {result[0] / gcd, result[1] / gcd};
        return answer;
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
