package programmers.level0;

/**
 * k의 개수
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-04
 **/
public class Solution_44 {
	public int solution(int i, int j, int k) {
		int answer = 0;
//		for (int l = i; l <= j; l++) {
//			final String[] split = String.valueOf(l).split("");
//			for (String s : split) {
//				if (s.equals(String.valueOf(k))) {
//					answer++;
//				}
//			}
//		}
		for (int l = i; l <= j; l++) {
			int num = l;
			while (num > 0) {
				if (num % 10 == k) {
					answer++;
				}
				num /= 10;
			}
		}
		return answer;
	}
}
