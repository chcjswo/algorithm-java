package programmers.level0;

/**
 * 공 던지기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-26
 **/
public class Solution_33 {
	public int solution(int[] numbers, int k) {
		int answer = (k - 1) * 2 % (numbers.length);
		return numbers[answer];
	}
}
