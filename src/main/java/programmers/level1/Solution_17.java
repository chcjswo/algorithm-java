package programmers.level1;

import java.util.Arrays;

/**
 * 최댓값과 최솟값
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-13
 **/
public class Solution_17 {
	public String solution(String s) {
		final String[] arr = s.split(" ");
		final int min = Arrays.stream(arr).mapToInt(Integer::parseInt).min().getAsInt();
		final int max = Arrays.stream(arr).mapToInt(Integer::parseInt).max().getAsInt();
		return min + " " + max;
	}
}
