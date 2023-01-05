package programmers.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * 끝말 잇기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-06
 **/
public class Solution_1 {
	public boolean solution(String[] words) {
		Set<String> set = new HashSet<>(words.length);
		String start = words[0];
		set.add(start);
		for (int i = 1; i < words.length; i++) {
			if (!words[i].startsWith(start.substring(start.length() - 1))) {
				return false;
			}
			start = words[i];
			set.add(start);
		}
		return set.size() == words.length;
	}
}
