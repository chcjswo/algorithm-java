package dailycoding;

/**
 * Created by chcjswo on 2020-06-30
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class CT_102 {

    public static final String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static void main(String[] args) {

    }

    public String getAlpha(int i) {
        int a = i / 26;
        int b = i % 26;
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);

        if (a > 26) {
            return "A" + getAlpha(a);
        } else {
            if (a == 1 && b == 0) {
                return alpha[a - 1];
            } else {
                return alpha[a - 1] + alpha[b - 1];
            }
        }
    }
}
