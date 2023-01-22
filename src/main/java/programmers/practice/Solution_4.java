package programmers.practice;

import java.util.Arrays;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-22
 **/
public class Solution_4 {
	public static void main(String[] args) {
		int[] arr1 = {2, 3};
		int[] arr2 = {1, 2, 3};
		System.out.println("return = " + solution(arr1, arr2));
		int[] arr3 = {1, 2, 3};
		int[] arr4 = {1, 1};
		System.out.println("return = " + solution(arr3, arr4));
	}

	public static int solution(int[] people, int[] tshirts) {
		int answer = 0;
		Arrays.sort(people);
		Arrays.sort(tshirts);
		for (int i = 0; i < people.length; i++) {
			for (int tshirt : tshirts) {
				if (people[i] == 0) {
					break;
				}
				if (tshirt >= people[i]) {
					people[i] = 0;
					answer++;
					break;
				}
			}
		}
		return answer;
	}
}
