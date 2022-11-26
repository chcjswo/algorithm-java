package programmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 암호 해독
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-26
 **/
public class Solution_34 {
	public String solution(String cipher, int code) {
		final List<String> list = Arrays
				.stream(cipher.split(""))
				.collect(Collectors.toList());
		StringBuilder answer = new StringBuilder();
		for (int i = code; i <= list.size(); i += code) {
			answer.append(list.get(i - 1));
		}
		return answer.toString();
	}
}
