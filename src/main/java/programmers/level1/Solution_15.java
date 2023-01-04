package programmers.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 폰켓몬
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2023-01-04
 **/
public class Solution_15 {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 0);
        }
        return Math.min(map.size(), nums.length / 2);
    }
}
