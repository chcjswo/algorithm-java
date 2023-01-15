package programmers.practice;

import java.util.Arrays;

/**
 * 예산
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-15
 **/
public class Solution_2 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		return search(0, d.length, d, budget);
	}

	private int search(int start, int end, int[] d, int budget) {
		int sum = 0;
		int count = 0;

		while(start <= end) {
			if(sum >= budget) {
				return count;
			} else {
				sum += d[start++];
				if (sum > budget) {
					return count;
				}
				count++;
			}
		}
		return count;
	}
}
