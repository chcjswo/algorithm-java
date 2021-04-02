package baekjoon;

import java.util.Scanner;

public class Q_17389 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ox = sc.next();

        int sum = 0;
        int continueSum = 0;
        for (int i = 0; i < n; i++) {
            byte c = (byte) ox.charAt(i);
            if (c == 79) {
                sum = sum + continueSum + (i + 1);
                continueSum++;
            } else {
                continueSum = 0;
            }
        }

        System.out.print(sum);
    }

}
