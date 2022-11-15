package inflearn.codingtest_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-03
 **/
public class SubArraySum {
    public static void main(String[] args) {
        int nums[] = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        final int solve = solve(nums, 7);
        System.out.println("solve = " + solve);
    }

    private static int solve(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == k) {
                    count++;
                }
            }

        }
        return count;
    }
}
