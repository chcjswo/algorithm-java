package baekjoon;

import java.util.Scanner;

/**
 * Created by chcjswo on 2019-06-11
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Question_15649 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println(n);
        System.out.println(m);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            for (int j = 2; j <= m; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void print(int m) {
    }
}
