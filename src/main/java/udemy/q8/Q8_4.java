package udemy.q8;

import java.util.Stack;

/**
 * Created by chcjswo on 2020-05-17
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Q8_4 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Q8_4() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public static void main(String[] args) {
        Q8_4 q8_4 = new Q8_4();

        q8_4.push(2);
        q8_4.push(2);
        q8_4.push(3);
        q8_4.push(3);
        q8_4.push(1);

        System.out.println(q8_4.pop());
        System.out.println(q8_4.pop());
        System.out.println(q8_4.pop());
        System.out.println(q8_4.pop());
        System.out.println(q8_4.pop());
        System.out.println(q8_4.min());
    }

    public void push(int newVal) {
        if (minStack.isEmpty() || newVal <= minStack.peek()) {
            minStack.push(newVal);
        }
        stack.push(newVal);
    }

    public int pop() {
        int val = stack.pop();
        if (!minStack.isEmpty() && val == minStack.peek()) {
            minStack.pop();
        }

        return val;
    }

    public int min() {
        if (minStack.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return minStack.peek();
    }
}
