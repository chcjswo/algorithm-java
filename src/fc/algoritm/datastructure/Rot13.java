package fc.algoritm.datastructure;

import java.util.Scanner;

public class Rot13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int end = s.length();
        char[] data = new char[end]; 
        
        for (int i=0; i < end; i++) {
        	int x = (int) s.charAt(i);

			if (x >= 65 && x <= 90) {
				x += 13;
				if (x > 90) {
					x = x - 90 + 65 - 1;
				}
			} else if (x >= 97 && x <= 122) {
				x += 13;
				if (x > 122) {
					x = x - 122 + 97 - 1;
				}
			}
			data[i] = (char) x;
		}
        
        for (char c : data) {
        	System.out.print(c);
        }
    }

}