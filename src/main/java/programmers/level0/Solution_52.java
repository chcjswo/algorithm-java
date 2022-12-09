package programmers.level0;

/**
 * 다음에 올 숫자
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-09
 **/
public class Solution_52 {
	public int solution(int[] common) {
		int answer;
		if (common[1] - common[0] == common[2] - common[1]) {
			answer = common[common.length - 1]  + (common[1] - common[0]);
		} else {
			answer = common[common.length - 1] * (common[1] / common[0]);
		}
		return answer;
	}
}
