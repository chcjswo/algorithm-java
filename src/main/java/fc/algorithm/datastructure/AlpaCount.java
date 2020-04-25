package fc.algorithm.datastructure;

import java.util.Scanner;

public class AlpaCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] alpa = new int[26];

        for (int i = 0; i < s.length(); i++) {
        	int x = (int)s.substring(i, i+1).charAt(0);
        	for (int j=97; j<=122; j++) {
        		if (x == j) {
        			alpa[j - 97] = alpa[j - 97] + 1;
        		}
        	}
		}

        for (int i : alpa) {
        	System.out.print(i + " ");
        }
    }
}
