package doit.ch01;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("sum: " + sum);
    }
}
