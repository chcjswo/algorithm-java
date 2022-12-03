package programmers.level0;

/**
 * 합성수 찾기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-03
 **/
public class Solution_41 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			if (!isPrime(i)) {
				answer++;
			}
		}
		return answer;
	}

	private boolean isPrime(int number) {
		if(number < 2 || number == 2) {
			return true;
		}

		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
