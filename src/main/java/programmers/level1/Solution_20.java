package programmers.level1;

/**
 * 부족한 금액 계산하기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-14
 **/
public class Solution_20 {
	public long solution(int price, int money, int count) {
		long answer = 0;
		for (int i = 1; i <= count; i++) {
			answer += ((long) i * price);
		}
		return answer > money ? answer - money : 0;
	}
}
