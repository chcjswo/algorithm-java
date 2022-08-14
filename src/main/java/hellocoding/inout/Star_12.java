package hellocoding.inout;

import java.util.Scanner;

public class Star_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i <= n*2-1; i++) {
        	int count = n;
        	for (int j=1; j<=n; j++) {

        		if (i <= n) {
        			if (count - i <= 0) {
        				System.out.print("*");
        			} else {
        				System.out.print(" ");
        			}
        			count--;
        		} else {
        			if ((count+j)- i > 0) {
        				System.out.print("*");
        			} else {
        				System.out.print(" ");
        			}
        		}

        	}
        	System.out.println("");
        }
    }

}
