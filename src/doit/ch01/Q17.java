package doit.ch01;

import java.util.Scanner;

/**
 * Do it! Q17 문제
 * Created by chcjswo on 2019-06-13
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Q17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        numberPyramid(n);
    }

    private static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            int max = (i - 1) * 2 + 1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= max; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }
}
