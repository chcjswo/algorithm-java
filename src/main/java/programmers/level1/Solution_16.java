package programmers.level1;

/**
 * 문자열 다루기 기본
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-13
 **/
public class Solution_16 {
	public boolean solution(String s) {
		if (s.length() != 4 && s.length() != 6) {
			return false;
		}
		final char[] chars = s.toCharArray();
		for (char aChar : chars) {
			if (!Character.isDigit(aChar)) {
				return false;
			}
		}
		return true;
	}
}
