package programmers.level0;

import java.util.Arrays;

/**
 * 등수 매기기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-12-10
 **/
public class Solution_54 {
	public int[] solution(int[][] score) {
		double[] avg = new double[score.length];
		int[] rank = new int[score.length];
		Arrays.fill(rank, 1);
		for (int i = 0; i < score.length; i++) {
			avg[i] = (double) (score[i][0] + score[i][1]) / 2;
		}

		for (int i = 0; i < avg.length; i++) {
			for (int j = 0; j < avg.length; j++) {
				if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}

		return rank;
	}
}
