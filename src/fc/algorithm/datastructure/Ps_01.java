package fc.algorithm.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class Ps_01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        sc.nextLine();
        
        while (tc-- > 0) {
            Stack<Integer> data = new Stack<Integer>();
        	String line = sc.nextLine().trim();
        	boolean b = true;
        	
        	for (int i=0; i<line.length(); i++) {
        		String ps = line.substring(i, i+1);

        		if (")".equals(ps)) {
        			if (data.empty()) {
        				b = false;
        			} else {
        				data.pop();
        			}
        		} else {
        			data.push(i);
        		}
        	}
        	
        	if (b) {
        		if (data.empty()) {
        			System.out.println("YES");
        		} else {
            		System.out.println("NO");
        		}
        	} else {
        		System.out.println("NO");
        	}
        }
    }
}