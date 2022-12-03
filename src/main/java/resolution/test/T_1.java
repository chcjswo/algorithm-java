package resolution.test;

/**
 * 에라토스테네스의 체
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-03
 **/
public class T_1 {
	public static void main(String[] args) {
		int n = 12;
		boolean[] prime = new boolean[n + 1];

		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i < Math.sqrt(n); i++) {
			if(prime[i]) {
				continue;
			}
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}

		for (int i = 1; i <= n; i++) {
			if (!prime[i]) {
				System.out.println("i = " + i);
			}
		}
	}
}
