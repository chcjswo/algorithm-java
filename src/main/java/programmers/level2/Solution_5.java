package programmers.level2;

import java.util.Arrays;

/**
 * 최솟값 만들기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-14
 **/
public class Solution_5 {
	public int solution(int[] a, int[] b) {
		int answer = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		int length = a.length;
		for (int i = 0; i < length; i++) {
			answer += (a[i] * b[length - i - 1]);
		}
		return answer;
	}
}
