package baekjoon;

import java.util.Random;

/**
 * 백준 15890번 문제
 *
 * Created by chcjswo on 2019-06-17
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Question_15890 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int yyyy = rnd.nextInt(9999);

        System.out.println(yyyy);

        int mm = rnd.nextInt(12);

        System.out.println(mm);

        int dd = rnd.nextInt(31);
    }
}
