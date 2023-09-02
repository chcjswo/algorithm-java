package programmers.level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 프린터
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-27
 **/
public class Solution_9 {
	public static void main(String[] args) {
		final int solution1 = solution(new int[]{2, 1, 3, 2}, 2);
		System.out.println("solution1 = " + solution1);
		final int solution2 = solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
		System.out.println("solution2 = " + solution2);
	}

	public static int solution(int[] priorities, int location) {
		final List<Integer> list = Arrays.stream(priorities).boxed().collect(Collectors.toList());
		final int max = Arrays.stream(priorities).max().getAsInt();
		final int value = priorities[location];
		int answer = 0;

		for (int i = 0; i < priorities.length; i++) {
			answer++;
			if (value == priorities[i]) {
				break;
			}
			list.remove(0);
			if (max > priorities[i]) {
				list.add(priorities[i]);
			}
		}
		System.out.println("list = " + list);
		return answer;
	}
}
