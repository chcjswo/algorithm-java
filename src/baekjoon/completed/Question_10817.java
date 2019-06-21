package baekjoon.completed;

import java.util.Scanner;

/**
 * 백준 10817번 문제
 *
 * Created by chcjswo on 2019-06-21
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Question_10817 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int result = 0;

        if ((a >= b && c >= a) || (a <= b && c <= a)) {
            result = a;
        }
        else if ((b >= a && c >= b) || (a >= b && c <= b)) {
            result = b;
        }
        else if ((a >= c && c >= b) || (a <= c && c <= b)) {
            result = c;
        }

        System.out.println(result);

    }
}