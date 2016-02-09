package fc.algoritm.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class Stick {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int size = s.length();
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		
		for (int i = 0; i < size; i++) {
			char x = s.charAt(i);
			
			if (x == '(') {
				stack.push(i);
			} else {
				if (stack.peek()+1 == i) {
					stack.pop();
					sum += stack.size();
				} else {
					stack.pop();
					sum++;
				}
			}
		}
		
		System.out.println(sum);

	}
}