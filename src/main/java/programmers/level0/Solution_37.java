package programmers.level0;

import java.util.LinkedHashSet;

/**
 * 소인수분해
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-30
 **/
public class Solution_37 {
	public int[] solution(int n) {
//		List<Integer> answer = new ArrayList<>();
//		for (int i = 2; i <= Math.sqrt(n); i++) {
//			while (n % i == 0) {
//				if (!answer.contains(i)) {
//					answer.add(i);
//				}
//				n /= i;
//			}
//		}
//
//		if (n != 1) {
//			answer.add(n);
//		}
//		return answer
//				.stream()
//				.sorted()
//				.mapToInt(Integer::intValue)
//				.toArray();
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();

		int i = 2;
		while (n != 0 && i <= n) {
			if (n % i == 0) {
				 hashSet.add(i);
				n /= i;
			} else {
				i++;
			}
		}

		return hashSet.stream().mapToInt(Integer::intValue).toArray();
	}
}
