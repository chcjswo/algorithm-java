package inflearn.codingtest_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-30
 **/
public class Palindrome {
    public static void main(String[] args) {
        String s = "banana";
        final String solve = new Palindrome().solve(s);
        System.out.println("solve = " + solve);
    }

    int start;
    int end;

    private String solve(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len; i++) {
            findSubstring(s, i , i);
            findSubstring(s, i , i + 1);
        }
        return s.substring(start, end + start);
    }

    private void findSubstring(String s, int left, int right) {
        while (0 <= left && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (end < right - left - 1) {
            start = left + 1;
            end = right - left - 1;
        }
    }
}
