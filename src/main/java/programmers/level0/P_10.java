package programmers.level0;

/**
 * 옷가게 할인 받기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-19
 **/
public class P_10 {

    public static void main(String[] args) {
        final int solution = solution(150_000);
        System.out.println("solution = " + solution);
    }

    private static int solution(int price) {
        if (price >= 500000) {
            return (int) (price * 0.8);
        } else if (price >= 300000) {
            return (int) (price * 0.9);
        } else if (price >= 100000) {
            return (int) (price * 0.95);
        }
        return price;
    }
}
