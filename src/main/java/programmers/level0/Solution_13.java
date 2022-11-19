package programmers.level0;

/**
 * 아이스 아메리카노
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-20
 **/
public class Solution_13 {
    public int[] solution(int money) {
        int coffeeFee = 5500;
        return new int[]{money / coffeeFee, money % coffeeFee};
    }
}
