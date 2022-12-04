package programmers.level0;

/**
 * 7의 개수
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-04
 **/
public class Solution_43 {
	public int solution(int[] array) {
		int answer = 0;
		for (int i : array) {
			for (String s : String.valueOf(i).split("")) {
				if ("7".equals(s)) {
					answer++;
				}
			}
		}
		return answer;
	}
}
