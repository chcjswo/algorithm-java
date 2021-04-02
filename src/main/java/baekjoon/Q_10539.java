package baekjoon;

import java.util.Scanner;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-04-01
 **/
public class Q_10539 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * (i + 1) - sum;
            sum += b[i];
        }
        for (int j : b) {
            System.out.print(j + " ");
        }
    }

}
