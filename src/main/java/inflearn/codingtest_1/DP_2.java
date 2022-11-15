package inflearn.codingtest_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-25
 **/
public class DP_2 {

    public static void main(String[] args) {
        String input = "112";
        final int solve = solve(input);
        System.out.println("solve = " + solve);
    }

    private static int solve(String input) {
        int n = input.length();
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = input.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= n; i++) {
            int first = Integer.parseInt(input.substring(i - 1, i));
            int second = Integer.parseInt(input.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                result[i] = result[i] + result[i - 1];
            }
            if (second >= 10 && second <= 26) {
                result[i] = result[i] + result[i - 2];
            }
        }
        for (int i : result) {
            System.out.println("i = " + i);
        }
        return result[n];
    }
}
