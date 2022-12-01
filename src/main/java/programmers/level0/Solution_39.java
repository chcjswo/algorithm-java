package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 컨트롤 제트
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-01
 **/
public class Solution_39 {
	public int solution(String s) {
		final List<String> list = Arrays.stream(s.split(" ")).collect(Collectors.toList());
		List<Integer> ints = new ArrayList<>();
		ints.add(Integer.parseInt(list.get(0)));
		for (int i = 1; i < list.size(); i++) {
			if ("Z".equals(list.get(i))) {
				ints.remove(ints.size() - 1);
			} else {
				ints.add(Integer.parseInt(list.get(i)));
			}
		}
		return ints.stream().mapToInt(i -> i).sum();
	}
}
