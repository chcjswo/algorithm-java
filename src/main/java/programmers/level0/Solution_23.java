package programmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 코딩테스트 연습 > 코딩테스트 입문 > 진료순서 정하기
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-21
 **/
public class Solution_23 {
    public int[] solution(int[] emergency) {
        List<Integer> list = Arrays.stream(emergency).boxed().collect(Collectors.toList());
        list.sort((a, b) -> b - a);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i + 1);
        }

        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        return answer;
//        return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
}
