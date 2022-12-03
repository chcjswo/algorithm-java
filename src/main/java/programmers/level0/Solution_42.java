package programmers.level0;

/**
 * 팩토리얼
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-03
 **/
public class Solution_42 {
	public int solution(int n) {
		int answer = 1;
		for (int i = 1; i < Math.sqrt(n); i++) {
			System.out.println("(n /= answer = " + (n / answer));
			n /= answer++;
		}
		System.out.println("n = " + n);
		if (n  == 2) {
			answer--;
		}
		System.out.println("answer = " + answer);
		return answer;
	}
}
