package inflearn.codingtest_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-11-04
 **/
public class MeetingRoom_2 {

    public static void main(String[] args) {

        int[][] intervals = {{5, 10}, {16, 20}, {0, 30}};
        //        int[][] intervals = {{5, 10}, {16, 20}};
        final int solve = solve(intervals);
        System.out.println("solve = " + solve);
    }

    private static int solve(int[][] intervals) {
        print(intervals);
        System.out.println("===============================");
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        print(intervals);

        final Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        for (int[] ints : intervals) {
            if (queue.isEmpty()) {
                queue.offer(ints);
            } else {
                if (queue.peek()[1] <= ints[0]) {
                    queue.poll();
                }
                queue.offer(ints);
            }
        }

        return queue.size();
    }

    private static void print(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.println("ints[i][j] = " + ints[i][j]);
            }
        }
    }
}
