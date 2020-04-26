package udemy.q5;

/**
 * Created by chcjswo on 2020-04-26
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Q5_1 {
    public static void main(String[] args) {
        Q5_1 q5_1 = new Q5_1();
        System.out.println(q5_1.countWays(4));
    }

    public int countWays(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        return countWays(n - 1) +
            countWays(n - 2) +
            countWays(n - 3) +
            countWays(n - 4) +
            countWays(n - 5) +
            countWays(n - 6);
    }
}
