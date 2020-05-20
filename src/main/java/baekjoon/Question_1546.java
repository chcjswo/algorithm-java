package baekjoon;

import java.util.Scanner;

/**
 * 백준 1546번 문제
 *
 * Created by chcjswo on 2019-06-21
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Question_1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] point = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            point[i] = a;

            if (max < a) {
                max = a;
            }
        }

        double sum = 0;
        for (int value : point) {
            sum += Double.parseDouble(String.valueOf(value)) / max * 100;
        }
        System.out.println(sum / point.length);
    }
}
