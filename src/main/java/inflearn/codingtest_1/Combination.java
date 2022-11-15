package inflearn.codingtest_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-01
 **/
public class Combination {

    public static void main(String[] args) {
        int n = 3;
        int k = 2;

        final List<List<Integer>> solve = solve(n, k);
        System.out.println("solve = " + solve);
    }

    private static List<List<Integer>> solve(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backtrack(result, list, n, k, 1);

        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> list, int n, int k, int start) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = start; i <= n; i++) {
                list.add(i);
                //                backtrack(result, list, n, k, start);
                backtrack(result, list, n, k, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
