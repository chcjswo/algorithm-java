package inflearn.codingtest_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-08
 **/
public class MapTest01 {
    public static void main(String[] args) {
        String s = "inflearninlove";
        final int result = solve(s);
        System.out.println("result = " + result);
    }

    private static int solve(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
//            if (!map.containsKey(c)) {
//                map.put(c, 1);
//            } else {
//                map.put(c, map.get(c) + 1);
//            }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
