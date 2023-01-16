package programmers.level1;

/**
 * 행렬의 덧셈
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-16
 **/
public class Solution_21 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				final int sum = arr1[i][j] + arr2[i][j];
				System.out.println("arr1[i][j] + arr2[i][j] = " + sum);
				answer[i][j] = sum;
			}
		}	
		return answer;
	}
}
