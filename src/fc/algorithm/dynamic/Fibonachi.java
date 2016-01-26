package fc.algorithm.dynamic;

import java.util.Scanner;

public class Fibonachi {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(fibonachi(n));
	}

	static int[] memo = new int[100];

	static int fibonachi(int x) {
		if (x <= 1) {
			return x;
		} else {
			if (memo[x] > 0) {
				return memo[x];
			}
			memo[x] = fibonachi(x - 1) + fibonachi(x - 2);
			return memo[x];
		}

	}

}