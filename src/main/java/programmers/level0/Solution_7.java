package programmers.level0;

import java.util.Arrays;

/**
 * 배열의 평균값
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-18
 **/
public class Solution_7 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double solution = solution(nums);
        System.out.println("solution = " + solution);
    }

    private static double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
