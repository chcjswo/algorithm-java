package doit.ch02;

/**
 * 진수 변환
 * Created by chcjswo on 2019-06-15
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Q8 {
    public static void main(String[] args) {
        int x = 59;
        int r = 8;
        char[] c = new char[32];

        System.out.println(r + "진수로 " + new String(convertNotation(x, r, c)) + " 입니다.");
    }

    /**
     * 진수 변환
     * @param x 변환할 정수
     * @param r 변환 진수
     * @param d 변환 자릿수
     * @return 변환된 정수
     */
    private static char[] convertNotation(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (x != 0) {
            System.out.println(String.format("%d|      %d", r, x));
            System.out.println(String.format("----------- %d", x % r));
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }

        return d;
    }
}
