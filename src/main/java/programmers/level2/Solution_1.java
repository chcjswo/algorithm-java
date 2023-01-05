package programmers.level2;

import java.util.Stack;

/**
 * 올바른 괄호
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-05
 **/
public class Solution_1 {
	boolean solution(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else {
				if (stack.empty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
