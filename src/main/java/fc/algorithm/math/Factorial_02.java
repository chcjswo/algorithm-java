package fc.algorithm.math;

import java.util.Scanner;

public class Factorial_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = factorial(a);
        int sum = 0;

        for (int i = 2; i * i <= n; i++) {
			while (n%i == 0) {
				n /= i;
				if (i == 5) sum++;
			}
		}
        System.out.println(sum);
    }

    public static int factorial(int x) {
    	if (x <= 1) return 1;

    	return x * factorial(x - 1);
    }
}
