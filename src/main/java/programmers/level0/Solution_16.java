package programmers.level0;

/**
 * 각도기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-20
 **/
public class Solution_16 {
    public int solution(int angle) {
        if (90 < angle && angle < 180) {
            return 3;
        } else if (angle == 90) {
            return 2;
        } else if (0 < angle && angle < 90) {
            return 1;
        }
        return 4;
    }
}
