package programmers.level2;

/**
 * JadenCase 문자열 만들기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-08
 **/
public class Solution_3 {
	public String solution(String s) {
		final char[] chars = s.toCharArray();
		StringBuilder answer = new StringBuilder();
		int count = 1;
		for (char aChar : chars) {
			if (aChar == ' ') {
				answer.append(" ");
				count = 1;
			} else {
				if (count == 1) {
					if (Character.isDigit(aChar)) {
						answer.append(aChar);
					} else {
						answer.append(String.valueOf(aChar).toUpperCase());
					}
				} else {
					answer.append(String.valueOf(aChar).toLowerCase());
				}
				count++;
			}
		}

		return answer.toString();
	}
}
