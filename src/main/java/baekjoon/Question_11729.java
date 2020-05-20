package baekjoon;

import java.util.Scanner;

/**
 * 백준 11729번 문제
 *
 * Created by chcjswo on 2019-07-14
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Question_11729 {
    private static int count = 0;
    private static String print = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();

        hanoi(n, 1, 3, sb);

        System.out.println(count);
        System.out.println(sb);
    }

    private static void hanoi(int n, int x, int y, StringBuilder sb) {
        count++;
        if (n > 1) {
            hanoi(n - 1, x, 6 - x -y, sb);
        }

        sb.append(x + " " + y + "\n");

        if (n > 1) {
            hanoi(n - 1, 6 - x - y, y, sb);
        }
    }
}
