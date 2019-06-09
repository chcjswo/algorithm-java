package doit.ch01;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        while (n > 0) {
            System.out.println(n);
            sum += n;
            n--;
        }

        System.out.println("sum: " + sum);
    }
}
