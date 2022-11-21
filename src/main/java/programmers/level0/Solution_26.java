package programmers.level0;

import java.util.Arrays;

/**
 * 코딩테스트 연습 > 코딩테스트 입문 > n의 배수 고르기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-22
 **/
public class Solution_26 {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(s -> s % n == 0).toArray();
    }
}
