package inflearn.codingtest_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-01
 **/
public class ArrayMath {
    public static void main(String[] args) {
        int[] prices = {8, 2, 6, 5, 1, 7, 5};
        final int solve = solve(prices);
        System.out.println("solve = " + solve);
    }

    private static int solve(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = 0;
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            } else {
                max = Math.max(max, nums[i] - min);
            }
        }

        return max;
    }
}
