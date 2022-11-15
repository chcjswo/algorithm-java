package inflearn.codingtest_1;

import java.util.*;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-17
 **/
public class MapPriorityQueue {
    public static void main(String[] args) {
        String[] s = {"a", "b", "c", "a", "b", "c", "a"};
        int k = 2;
        final List<String> solve = solve(s, k);
        System.out.println("solve = " + solve);
    }

    private static List<String> solve(String[] s, int k) {
        List<String> result = new ArrayList<>();
        Map<String ,Integer> map = new HashMap<>();

        for (String item : s) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) ->
            Objects.equals(a.getValue(), b.getValue()) ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
        }

        while (k-- > 0) {
            result.add(Objects.requireNonNull(pq.poll()).getKey());
        }

        return result;
    }
}
