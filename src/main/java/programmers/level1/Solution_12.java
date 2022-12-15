package programmers.level1;

import java.util.Stack;

/**
 * 같은 숫자는 싫어
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-15
 **/
public class Solution_12 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
