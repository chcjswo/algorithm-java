package baekjoon.old;

import java.util.Arrays;
import java.util.Scanner;

public class Q_1920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        int[] answer = new int[n2];
        Arrays.fill(answer, 0);

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j]) {
                    answer[j] = 1;
                    break;
                }
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }

    }

}
