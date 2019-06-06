package fc.algorithm.datastructure;

import java.util.Scanner;

public class Stack {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        sc.nextLine();
        int size = 0;
        int[] stack = new int[10000];
        
        while (tc-- > 0) {
        	String cline = sc.nextLine();
            String[] s = cline.split(" ");
            String cmd = s[0];
        	
        	if ("push".equals(cmd)) {
                int num = Integer.parseInt(s[1]);
        		stack[size] = num;
        		size++;
        	} else if ("pop".equals(cmd)) {

        		if (emptyStach(size))
        			System.out.println(-1);
        		else {
            		stack[size--] = 0;
        			System.out.println(stack[size]);
        		}
        	} else if ("size".equals(cmd)) {
        		System.out.println(size);
        		
        	} else if ("empty".equals(cmd)) {
        		if (emptyStach(size))
        			System.out.println(1);
        		else
        			System.out.println(0);
        	} else if ("top".equals(cmd)) {
        		if (emptyStach(size))
        			System.out.println(-1);
        		else
        			System.out.println(stack[size-1]);
        	}
        }
    }
    
    static boolean emptyStach(int size) {
    	if (size == 0)
    		return true;
    	
    	return false;
    }
}