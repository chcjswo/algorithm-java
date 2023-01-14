package programmers.level1;

/**
 * 약수의 개수와 덧셈
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-14
 **/
public class Solution_18 {
	public int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i;  j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}
		return answer;
	}
}
