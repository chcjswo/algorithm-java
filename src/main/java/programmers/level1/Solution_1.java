package programmers.level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 푸드 파이트 대회
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-22
 **/
public class Solution_1 {
    public String solution(int[] food) {
        int[] item = new int[food.length - 1];
        System.arraycopy(food, 1, item, 0, food.length - 1);
        int[] result = new int[item.length];
        for (int i = 0; i < item.length; i++) {
            result[i] = item[i] / 2;
        }

        Arrays.stream(result).forEach(s -> System.out.println("s = " + s));
        List<Integer> collect = Arrays.stream(result).boxed().collect(Collectors.toList());
        String answer = "";
        for (int i = 0; i < collect.size(); i++) {
            answer += String.valueOf(i + 1).repeat(collect.get(i));
        }
        StringBuilder s = new StringBuilder(answer + "0");
        for (int i = answer.length() - 1; i >= 0; i--) {
            s.append(answer.charAt(i));
        }
        return s.toString();
    }
}
