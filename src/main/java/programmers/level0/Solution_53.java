package programmers.level0;

import java.util.stream.IntStream;

/**
 * 삼각형의 완성조건 (2)
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-10
 **/
public class Solution_53 {
	public int solution(int[] sides) {
		int max = Math.max(sides[0], sides[1]);
		int min = Math.min(sides[0], sides[1]);
		int start = max - min + 1;
		int count1 = (int) IntStream.range(start , max + 1).boxed().mapToInt(i -> i).count();
		int count2 = (int) IntStream.range(max + 1, sides[0] + sides[1]).boxed().mapToInt(i -> i).count();
		return count1 + count2;
	}
}
