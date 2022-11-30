package programmers.level0;

/**
 * 숨어있는 숫자의 덧셈 (2)
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-30
 **/
public class Solution_38 {
	public int solution(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			final String s1 = String.valueOf(s.charAt(i));
			if (s1.matches("[0-9]")) {
				sb.append(s1);
			} else {
				if (sb.length() > 0) {
					answer += Integer.parseInt(sb.toString());
					sb = new StringBuilder();
				}
			}
		}

		if (sb.length() > 0) {
			answer += Integer.parseInt(sb.toString());
		}
		return answer;
	}
}
