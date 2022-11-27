package programmers.level0;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 한 번만 등장한 문자
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-28
 **/
public class Solution_35 {
	public String solution(String s) {
		final List<String> list = Arrays
				.stream(s.split(""))
				.sorted()
				.collect(Collectors.toList());
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String s1 : list) {
			map.put(s1, map.getOrDefault(s1, 0) + 1);
		}
		StringBuilder answer = new StringBuilder();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				answer.append(entry.getKey());
			}
		}
		return answer.toString();
	}
}
