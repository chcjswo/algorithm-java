package udemy.q8;


import java.util.Stack;

/**
 * Created by chcjswo on 2020-05-17
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Q8_3 {
    public static void main(String[] args) {
        Q8_3 q8_3 = new Q8_3();
        System.out.println(q8_3.isPalindrome("level"));
        System.out.println(q8_3.isPalindrome("noon"));
    }

    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0, len = s.length() / 2; i < len; i++) {
            stack.push(s.charAt(i));
        }
        for (int i = (s.length() + 1) / 2, len = s.length(); i < len; i++) {
            if (stack.pop() != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
