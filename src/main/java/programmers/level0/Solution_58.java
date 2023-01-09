package programmers.level0;

import java.util.*;

/**
 * 특이한 정렬
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-09
 **/
public class Solution_58 {
	public int[] solution(int[] numlist, int n) {
		int[] answer = new int[numlist.length];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numlist.length; i++) {
			map.put(i, Math.abs(n - numlist[i]));
		}
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		int key = entryList.get(0).getKey().intValue();
		answer[0] = numlist[key];
		for (int i = 1; i <= (entryList.size() - 1); i++) {
			final int lastIndex = i + 1 >= entryList.size() ? entryList.size() - 1 : i + 1;
			if (Objects.equals(entryList.get(i).getValue(), entryList.get(lastIndex).getValue())) {
				final Map.Entry<Integer, Integer> m1 = entryList.get(i);
				final Map.Entry<Integer, Integer> m2 = entryList.get(lastIndex);
				answer[i] = Math.max(numlist[m1.getKey()], numlist[m2.getKey()]);
				answer[lastIndex] = Math.min(numlist[m1.getKey()],
										 numlist[m2.getKey()]);
				i++;
			} else {
				answer[i] = numlist[entryList.get(i).getKey()];
			}
		}
		return answer;
	}
}
