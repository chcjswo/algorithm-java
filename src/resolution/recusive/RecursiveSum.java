package resolution.recusive;

import java.util.Scanner;

/**
 * 재귀호출로 합 구하기
 * Created by chcjswo on 2019-06-10
 * Blog : http://mocadev.tistory.com
 * Github : http://github.com/chcjswo
 */
public class RecursiveSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(recursiveSum(in.nextInt()));
    }

    private static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n -1);
    }
}
