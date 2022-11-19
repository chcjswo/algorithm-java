package programmers.level0;

/**
 * 배열 뒤집기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-20
 **/
public class Solution_12 {
    public int[] solution(int[] nums) {
        int[] result = new int[nums.length];
        int count = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[count--];
            result[i] = temp;
        }
        return result;
    }
}
