package programmers.level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 없는 숫자 더하기
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-14
 **/
public class Solution_10 {
    public int solution(int[] numbers) {
        List<String> list = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.toList());
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (!list.contains(String.valueOf(i))) {
                answer += i;
            }
        }
        return answer;
    }
}
