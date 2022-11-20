package programmers.level0;

/**
 * 양꼬치
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-20
 **/
public class Solution_17 {
    public int solution(int n, int k) {
        int price1 = 12000;
        int price2 = 2000;
        int bonus = n / 10;
        return (price1 * n) + ((k - bonus) * price2);
    }
}
