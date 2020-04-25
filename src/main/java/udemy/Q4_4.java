package udemy;

/**
 * udemy 4-4 문제
 * Created by chcjswo on 2019-06-17
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Q4_4 {
    public static void main(String[] args) {
        String data = "aabbbbcccdff";

        System.out.println(coding(data));
    }

    private static String coding(String s) {
        if (s == null) {
            return null;
        }

        char[] c = s.toCharArray();
        String result = "";
        int count = 1;
        char prev = c[0];

        for (int i = 1; i < c.length ; i++) {
            if (prev == c[i]) {
                count++;
            } else {
                result = result + prev + count;
                count = 1;
                prev = c[i];
            }
        }

        result = result + prev + count;

        return result;
    }
}
