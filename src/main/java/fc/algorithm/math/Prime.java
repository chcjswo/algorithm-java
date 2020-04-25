package fc.algorithm.math;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
        	if (prime(i))
        		System.out.println(i);
		}
    }

    static boolean prime(int x) {
    	if (x < 2) return false;

    	for (int i=2; i*i <= x; i++) {
    		if (x%i == 0) return false;
    	}

    	return true;
    }
}
