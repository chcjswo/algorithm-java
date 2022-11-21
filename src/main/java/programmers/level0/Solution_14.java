package programmers.level0;

import java.util.Arrays;

/**
 * 짝수 홀수 개수
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-20
 **/
public class Solution_14 {
    public int[] solution(int[] nums) {
        final int count = (int) Arrays.stream(nums).filter(s -> s % 2 == 0).count();
        return new int[]{count, nums.length - count};
    }
}
