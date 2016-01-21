package fc.algoritm.inout;

import java.util.Scanner;

public class InOut_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        for (int i=0; i<s.length(); i++) {
        	if (i >0 && i%10 == 0) {
        		System.out.println("");
        		System.out.print(s.charAt(i));
        	} else {
        		System.out.print(s.charAt(i));
        	}
        }
    }

}