package programmers.level0;

import java.util.Arrays;

/**
 * 가까운 수
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-06
 **/
public class Solution_46 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] ints = Arrays.stream(array).sorted().toArray();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            int abs = Math.abs(ints[i] - n);
            if (min > abs) {
                answer = ints[i];
                min = abs;
            }
        }
        return answer;
    }
}
