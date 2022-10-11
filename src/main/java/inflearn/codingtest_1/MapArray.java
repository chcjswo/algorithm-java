package inflearn.codingtest_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-11
 **/
public class MapArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 5, 5, 5, 5};
        int k=2;
        final List<Integer> integers = topFrequent(nums, k);
        System.out.println("integers = " + integers);
    }

    private static List<Integer> topFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] list = new ArrayList[nums.length];
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            int frequent = map.get(key);
            if (list[frequent] == null) {
                list[frequent] = new ArrayList<>();
            }
            list[frequent].add(key);
        }

        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] != null) {
                for (int j = 0; j < list[i].size() && result.size() < k; j++) {
                    result.add(list[i].get(j));
                }
            }
        }

       return result;
    }
}
