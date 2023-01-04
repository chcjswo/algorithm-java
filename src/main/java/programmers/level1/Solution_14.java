package programmers.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 완주하지 못한 선수
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2023-01-04
 **/
public class Solution_14 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            if (map.containsKey(s)) {
                map.replace(s, map.get(s) - 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return answer;
    }
}
