package programmers.level0;

import java.util.Arrays;

/**
 * 중앙값 구하기
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-17
 **/
public class Solution_3 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 7, 10, 11};
//        int[] numbers = {9, -1, 0};
        int solution = solution(numbers);
        System.out.println("solution = " + solution);
    }

    private static int solution(int[] array) {
        int[] ints = Arrays.stream(array).sorted().toArray();
        int mind = ints.length / 2;
        return ints[mind];
    }
}
