package programmers.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 배열 회전시키기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-26
 **/
public class Solution_32 {
	public int[] solution(int[] numbers, String direction) {
		final List<Integer> list = Arrays
				.stream(numbers)
				.boxed()
				.collect(Collectors.toList());
		if ("right".equals(direction)) {
			Collections.rotate(list, 1);
		} else {
			Collections.rotate(list, -1);
		}
		return list.stream().mapToInt(m -> m).toArray();
	}
}
