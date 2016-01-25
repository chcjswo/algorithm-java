package fc.algoritm.math;

import java.util.Scanner;

public class Gcd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(gcd(a, b));
    }
    
    static int gcd(int x, int y) {
    	if (y == 0) {
    		return x;
    	} else {
    		return gcd(y, x%y);
    	}
    	
    }

}
