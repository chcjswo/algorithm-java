package fc.algorithm.inout;

import java.util.Scanner;

public class InOut_01 {
    public static void main(String args[]) {
    	
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
	        String s = sc.nextLine();
			System.out.println(s);
        }
    }

}