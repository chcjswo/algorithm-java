package fc.algorithm.datastructure;

import java.util.Scanner;

public class StringAnalytics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int[] data = new int[4];
            for (int i = 0; i < s.length(); i++) {
				int a = (int)s.charAt(i);

				if (a>=97 && a<=122) {
					data[0] = data[0] + 1;
				} else if (a>=65 && a<=90) {
					data[1] = data[1] + 1;
				} else if (a>=48 && a<=57) {
					data[2] = data[2] + 1;
				} else if (a==32) {
					data[3] = data[3] + 1;
				}
			}
            for (int x : data) {
            	System.out.print(x + " ");
            }
            System.out.println("");
        }

    }

}
