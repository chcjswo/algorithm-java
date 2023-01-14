package programmers.level1;

/**
 * 최대공약수와 최소공배수
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-14
 **/
public class Solution_19 {
	public int[] solution(int n, int m) {
		final int gcd = gcd(n, m);
		final int lcm = n * m / gcd(n, m);
		return new int[]{gcd, lcm};
	}

	private int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
