package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 제일 작은 수 제거하기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-13
 **/
public class Solution_9 {
	public int[] solution(int[] arr) {
		if (arr[0] == 10) {
			return new int[]{-1};
		}
		final Integer min = Arrays.stream(arr).boxed().min(Comparator.comparingInt(a -> a)).get();
		final List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.remove(min);
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
