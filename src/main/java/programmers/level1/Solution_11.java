package programmers.level1;

/**
 * 내적
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-14
 **/
public class Solution_11 {
	public int solution(int[] a, int[] b) {
		int answer = 0;
		for (int i = 0; i < a.length; i++) {
			answer = answer + (a[i] * b[i]);
		}
		return answer;
	}
}
