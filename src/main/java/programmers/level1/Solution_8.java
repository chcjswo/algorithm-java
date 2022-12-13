package programmers.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * 나누어 떨어지는 숫자 배열
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-13
 **/
public class Solution_8 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                result.add(i);
            }
        }
        if (result.size() == 0) {
            return new int[]{-1};
        }
        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
