package inflearn.codingtest_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-31
 **/
public class Permutation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        final List<List<Integer>> solve = solve(nums);
        System.out.println("solve = " + solve);
    }

    private static List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(result, list, nums);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
        } else {
            for (int num : nums) {
                if (list.contains(num)) {
                    continue;
                }
                list.add(num);
                backtrack(result, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }
}
