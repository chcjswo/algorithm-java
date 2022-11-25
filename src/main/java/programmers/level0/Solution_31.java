package programmers.level0;

/**
 * 2차원으로 만들기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-25
 **/
public class Solution_31 {
	public int[][] solution(int[] nums, int n) {
		int[][] answer = new int[nums.length / n][n];
		for (int i = 0; i < nums.length; i += n) {
			for (int j = 0; j < n; j++) {
				answer[i / n][j] = nums[i + j];
			}
		}
		return answer;
	}
}
