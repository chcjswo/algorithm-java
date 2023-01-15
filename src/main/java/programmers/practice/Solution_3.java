package programmers.practice;

import java.util.Arrays;

/**
 * 숫자 게임
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-15
 **/
public class Solution_3 {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			if (A[i] < B[i]) {
				answer++;
			}
		}
		return answer;
	}
}
