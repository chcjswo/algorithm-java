package programmers.level0;

/**
 * 문자열 밀기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-30
 **/
public class Solution_57 {
	public int solution(String a, String b) {
		if (a.equals(b)) {
			return 0;
		}
		int answer = -1;
		for (int i = 0; i < a.length(); i++) {
			final String s1 = a.substring(0, a.length() - 1);
			final String s2 = a.substring(a.length() - 1);
			a = s2 + s1;
			if (a.equals(b)) {
				return i + 1;
			}
		}
		return answer;
	}
}
