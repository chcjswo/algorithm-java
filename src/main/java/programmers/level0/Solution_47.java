package programmers.level0;

import java.util.HashMap;
import java.util.Map;

/**
 * 영어가 싫어요
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-06
 **/
public class Solution_47 {
    public long solution(String numbers) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("zero", 0);

        char[] chars = numbers.toCharArray();
        String compare = "";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            compare += chars[i];
            if (map.containsKey(compare)) {
                result.append(map.get(compare));
                compare = "";
            }
        }
        return Long.parseLong(result.toString());
    }
}
