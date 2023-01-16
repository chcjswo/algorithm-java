package programmers.level2;

import java.util.HashMap;
import java.util.Map;

/**
 * 위장
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-15
 **/
public class Solution_6 {
	public int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map = new HashMap<>();
		for (String[] clothe : clothes) {
			final String s = clothe[1];
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		for (Integer value : map.values()) {
			answer *= (value + 1);
		}
		return answer - 1;
	}
}
