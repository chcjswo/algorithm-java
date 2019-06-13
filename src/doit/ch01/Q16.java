package doit.ch01;

/**
 * Do it! Q16 문제
 * Created by chcjswo on 2019-06-13
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Q16 {
    public static void main(String[] args) {
        int n = 4;
        star(n);
    }

    private static void star(int n) {
        for (int i = 0; i < n; i++) {
            int max = i * 2 + 1;
            for (int j = 0; j < n - (i + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < max; j++) {
                System.out.print( "*");
            }
            System.out.println();

        }
    }
}
