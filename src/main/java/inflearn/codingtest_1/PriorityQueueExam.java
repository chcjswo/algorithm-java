package inflearn.codingtest_1;

import java.util.PriorityQueue;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-17
 **/
public class PriorityQueueExam {
    public static void main(String[] args) {
        int[] nums = {1, 8, 3, 5};
        final int solve = solve(nums);
        System.out.println("solve = " + solve);
    }

    private static int solve(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            priorityQueue.offer(num);
        }
        int result = 0;
        while (priorityQueue.size() > 1) {
            final int sum = priorityQueue.poll() + priorityQueue.poll();
            result += sum;
            priorityQueue.offer(sum);
        }
        return result;
    }
}
