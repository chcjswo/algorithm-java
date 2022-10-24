package inflearn.codingtest_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-24
 **/
public class DP_1 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1, 8};
        final int solve = solve(nums);
        System.out.println("solve = " + solve);
    }

    private static int solve(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] result = new int[nums.length + 1];
        result[0] = 0;
        result[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            result[i + 1] = Math.max(result[i], result[i - 1] + val);
        }

        for (int val : result) {
            System.out.println("val = " + val);
        }

        return result[nums.length];
    }
}
