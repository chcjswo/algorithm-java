package programmers.level2;

import java.util.Arrays;

/**
 * 이진 변환 반복하기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-18
 **/
public class Solution_8 {
	public int[] solution(String s) {
		int length = Integer.MAX_VALUE;
		int loop = 0;
		int count = 0;

		while (length > 1) {
			count += (int) Arrays.stream(s.split("")).filter(f -> f.equals("0")).count();
			length = s.replaceAll("0", "").length();
			s = Integer.toBinaryString(length);
			loop++;
		}
		return new int[]{loop, count};
	}
}
