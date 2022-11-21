package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩테스트 연습 > 코딩테스트 입문 > 최댓값 만들기(1)
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-21
 **/
public class Solution_21 {
    public int solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int item : numbers) {
            list.add(item);
        }
        list.sort((a, b) -> b - a);
        return list.get(0) * list.get(1);
    }
}
