package inflearn.codingtest_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-28
 **/
public class ToCharArray {
    public static void main(String[] args) {
        String s1 = "(a(b(c)d)";
        String s2 = "(((a(b(c(e(f)d))";

        String solve = new ToCharArray().solve(s1);
        System.out.println("solve = " + solve);
        solve = new ToCharArray().solve(s2);
        System.out.println("solve = " + solve);
    }

    public String solve(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int open = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0) {
                    continue;
                }
                open--;
            }
            sb.append(c);
        }

        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && open-- > 0) {
                continue;
            }
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();
    }
}
