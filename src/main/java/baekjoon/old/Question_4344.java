package baekjoon.old;

import java.util.Scanner;

/**
 * 백준 4344번 문제
 *
 * Created by chcjswo on 2019-06-22
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Question_4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        double[] arr = new double[c];

        for (int i = 0; i < c; i++) {
            int n = in.nextInt();
            int sum = 0;
            double rate = 0;
            for (int j = 0; j < n; j++) {
                int point = in.nextInt();
                sum += point;

            }
            arr[i] = Double.parseDouble(String.valueOf(sum)) / n;
        }

        for (double item : arr) {
            System.out.print(item + " ");
        }
    }
}
