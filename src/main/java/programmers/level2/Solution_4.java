package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * H-Index
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-08
 **/
public class Solution_4 {
	public int solution(int[] citations) {
		List<Integer> list = new ArrayList<>();
		for (int citation : citations) {
			list.add(citation);
		}
		list.sort(Collections.reverseOrder());
		int answer = 0;
		for (int i = 0; i < list.size(); i++) {
			if ((i + 1) <= list.get(i)) {
				answer++;
			}
		}
		return answer;
	}
}
