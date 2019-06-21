package baekjoon.solving;

import java.util.Scanner;

/**
 * 백준 10871번 문제
 *
 * Created by chcjswo on 2019-06-21
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Question_10871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a < x) {
                result[i] = a;
            }
        }

        for (int item : result) {
            if (item > 0) {
                System.out.print(item + " ");
            }
        }
    }
}