package inflearn.codingtest_1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-29
 **/
public class StringIndexOf {
    public static void main(String[] args) {
        String str[] = {"test", "teacher"};
        final String solve = new StringIndexOf().solve(str);
        System.out.println("solve = " + solve);
    }

    private String solve(String[] s) {
        if (s.length == 0) {
            return "";
        }

        String first = s[0];

        for (int i = 1; i < s.length; i++) {
            while (s[i].indexOf(first) != 0) {
                first = first.substring(0, first.length() - 1);
            }
        }
        return first;
    }
}
