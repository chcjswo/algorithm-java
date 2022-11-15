package inflearn.codingtest_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-04
 **/
public class ArrayToList {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        final List<List<Integer>> lists = array2List(array);
        System.out.println("lists = " + lists);

        final int[][] ints = list2Array(lists);
        System.out.println("ints = " + Arrays.deepToString(ints));
    }

    private static List<List<Integer>> array2List(int[][] array) {
        List<List<Integer>> a = new ArrayList<>();
        for (int[] ints : array) {
            List<Integer> b = new ArrayList<>();
            for (int anInt : ints) {
                b.add(anInt);
            }
            a.add(b);
        }
        return a;
    }

    private static int[][] list2Array(List<List<Integer>> lists) {
        int[][] result = new int[lists.size()][];
        for (int i = 0; i < lists.size(); i++) {
            final List<Integer> integers = lists.get(i);
            result[i] = new int[integers.size()];
            for (int j = 0; j < integers.size(); j++) {
                result[i][j] = integers.get(j);
            }
        }
        return result;
    }
}
