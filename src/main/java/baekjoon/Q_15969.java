package baekjoon;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Q_15969 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }

        OptionalInt min = Arrays.stream(b).min();
        int minValue = min.getAsInt();

        OptionalInt max = Arrays.stream(b).max();
        int maxValue = max.getAsInt();

        System.out.println(maxValue - minValue);

    }

}
