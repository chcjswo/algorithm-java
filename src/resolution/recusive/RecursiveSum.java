package resolution.recusive;

import java.util.Scanner;

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
