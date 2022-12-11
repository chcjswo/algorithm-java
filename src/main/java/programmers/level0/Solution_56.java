package programmers.level0;

/**
 * 유한소수 판별하기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-11
 **/
public class Solution_56 {
	public int solution(int a, int b) {
		int gcd = gcd(a, b);
		int i = b / gcd;
		int i2 = b / gcd;

		for(int j = 2; j <= i2; j++) {
			while(i2 % j == 0) {
				if (j != 2 && j != 5) {
					return 2;
				}
				i2 /= j;
			}
		}

		if (i % 2 == 0 || i2 % 5 == 0) {
			return 1;
		}
		if (a % b == 0) {
			return 1;
		}
		return 2;
	}

	private int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
