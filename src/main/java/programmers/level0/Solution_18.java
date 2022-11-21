package programmers.level0;

import java.util.HashMap;
import java.util.Map;

/**
 * 코딩테스트 연습 > 코딩테스트 입문 > 중복된 숫자 개수
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-20
 **/
public class Solution_18 {
    public int solution(int[] array, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : array) {
            map.put(item, map.getOrDefault(item, 0 ) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == n) {
                return entry.getValue();
            }
        }
        return 0;
    }
}
