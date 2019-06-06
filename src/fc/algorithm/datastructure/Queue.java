package fc.algorithm.datastructure;

import java.util.Scanner;

public class Queue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        sc.nextLine();
        
        int head = 0, tail = 0;
        int[] data = new int[10000];
        
        while (tc-- >0) {
        	String[] arr = sc.nextLine().split(" ");
        	String cmd = arr[0];
        	
        	switch (cmd) {
        		case "push" :
        			int x = Integer.parseInt(arr[1]);
        			data[tail] = x;
        			tail++;
        			break;

        		case "pop" :
        			if (head == tail) {
        				System.out.println(-1);
        			} else {
            			System.out.println(data[head]);
            			head++;
        			}
        			break;

        		case "size" :
        			System.out.println(tail - head);
        			break;

        		case "empty" :
        			if (head == tail) {
        				System.out.println(1);
        			} else {
        				System.out.println(0);
        			}
        			break;

        		case "front" :
        			if (head == tail) {
        				System.out.println(-1);
        			} else {
        				System.out.println(data[head]);
        			}
        			break;

        		case "back" :
        			if (head == tail) {
        				System.out.println(-1);
        			} else {
        				System.out.println(data[tail-1]);
        			}
        			break;
        	}
        }
    }
}