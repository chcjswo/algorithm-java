package inflearn.codingtest_2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-03
 **/
public class MeetingRoom {

    public static void main(String[] args) {
//        int[][] intervals = {{5, 10}, {16, 20}, {0, 30}};
        int[][] intervals = {{5, 10}, {16, 20}};
        final boolean solve = solve(intervals);
        System.out.println("solve = " + solve);
    }

    private static boolean solve(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return true;
        }

        print(intervals);
        System.out.println("===============================");
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        print(intervals);

        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                return false;
            }
            end = intervals[i][1];
        }

        return true;
    }

    private static void print(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.println("ints[i][j] = " + ints[i][j]);
            }
        }
    }
}
