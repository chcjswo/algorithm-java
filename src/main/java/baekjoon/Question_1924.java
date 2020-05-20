package baekjoon;

import java.util.Scanner;

/**
 * 백준 1924번 문제
 *
 * Created by chcjswo on 2019-06-22
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Question_1924 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        String[] WEEK = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int day = y;

        for (int i = 1; i <= x - 1; i++) {
            if (i == 1 | i == 3 || i == 5 || i == 7 | i == 8 || i == 10 || i == 12) {
                day += 31;
            } else if (i == 4 | i == 6 || i == 9 || i == 11) {
                day += 30;
            } else if (i == 2) {
                day += 28;
            }
        }

        System.out.println(WEEK[day%7]);
    }
}
