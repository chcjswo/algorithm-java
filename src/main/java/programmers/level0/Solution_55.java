package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * 연속된 수의 합
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-10
 **/
public class Solution_55 {
	public int[] solution(int num, int total) {
		List<Integer> result = new ArrayList<>();
		final int i = total / num;
		final int i1 = total % num == 0 ? num / 2 : num / 2 - 1;
		int start = i - i1;
		for (int j = 0; j < num; j++) {
			result.add(start + j);
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
