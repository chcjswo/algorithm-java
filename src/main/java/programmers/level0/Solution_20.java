package programmers.level0;

/**
 * 코딩테스트 연습 > 코딩테스트 입문 > 점의 위치 구하기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-21
 **/
public class Solution_20 {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        if (x > 0 && y > 0) {
            return 1;
        }
        if (x < 0 && y > 0) {
            return 2;
        }
        if (x < 0 && y < 0) {
            return 3;
        }
        if (x > 0 && y < 0) {
            return 4;
        }
        return 0;
    }
}
