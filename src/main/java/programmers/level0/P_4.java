package programmers.level0;

import java.util.*;

/**
 * 최빈값 구하기
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-11-17
 **/
public class P_4 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 4, 4, 4};
        int solution = solution(nums);
        System.out.println("solution = " + solution);
    }

    private static int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : array) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        int maxValue = 0;
        List<Integer> top = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxValue < entry.getValue()) {
                maxValue = entry.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                top.add(entry.getKey());
            }
        }

        int answer = top.size() > 1 ? -1 : top.get(0);
        return answer;
    }
}
