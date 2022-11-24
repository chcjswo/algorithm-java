package programmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 인덱스 바꾸기
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-25
 **/
public class Solution_30 {
    public String solution(String s, int num1, int num2) {
        final List<String> list = Arrays.stream(s.split("")).collect(Collectors.toList());
        final String s1 = list.get(num1);
        final String s2 = list.get(num2);
        list.remove(num1);
        list.add(num1, s2);
        list.remove(num2);
        list.add(num2, s1);
        return list.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}
