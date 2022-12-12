package programmers.level1;

/**
 * 하샤드 수
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-12
 **/
public class Solution_5 {
	public boolean solution(int x) {
		int sum = 0;
		int orijin = x;
		while (x > 0) {
			sum += x % 10;
			x /= 10;
		}
		return orijin % sum == 0;
	}
}
