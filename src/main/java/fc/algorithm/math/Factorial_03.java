package fc.algorithm.math;

import java.util.Scanner;

public class Factorial_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for (int i=5; i<=a; i*=5) {
        	sum += a/i;
        }

        System.out.println(sum);
    }

}
