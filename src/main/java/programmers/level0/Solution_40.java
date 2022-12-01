package programmers.level0;

/**
 * 로그인 성공?
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-02
 **/
public class Solution_40 {
	public String solution(String[] idpw, String[][] db) {
		String answer = "";
		for (String[] strings : db) {
			System.out.println(strings[0] + " / " + strings[1]);
			if (idpw[0].equals(strings[0]) && idpw[1].equals(strings[1])) {
				return "login";
			} else if (idpw[0].equals(strings[0])) {
				return "wrong pw";
			} else if (idpw[1].equals(strings[1])) {
				answer = "fail";
			}
		}
		return answer;
	}
}
