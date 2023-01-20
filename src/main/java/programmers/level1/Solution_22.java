package programmers.level1;

/**
 * 3진법 뒤집기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-20
 **/
public class Solution_22 {
	public int solution(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			sb.append(n % 3);
			n /= 3;
		}
		return Integer.parseInt(sb.toString(),3);
	}
}
