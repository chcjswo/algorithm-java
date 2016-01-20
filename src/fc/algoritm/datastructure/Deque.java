package fc.algoritm.datastructure;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Deque {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        sc.nextLine();

        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        int x;
        
        while (tc-- >0) {
        	String[] arr = sc.nextLine().split(" ");
        	String cmd = arr[0];
        	
        	switch (cmd) {
        		case "push_front" :
        			x = Integer.parseInt(arr[1]);
        			ad.addFirst(x);
        			break;
        			
        		case "push_back" :
        			x = Integer.parseInt(arr[1]);
        			ad.addLast(x);
        			break;

        		case "pop_front" :
        			if (ad.isEmpty()) {
        				System.out.println(-1);
        			} else {
            			System.out.println(ad.pollFirst());
        			}
        			break;

        		case "pop_back" :
        			if (ad.isEmpty()) {
        				System.out.println(-1);
        			} else {
            			System.out.println(ad.pollLast());
        			}
        			break;

        		case "size" :
        			System.out.println(ad.size());
        			break;

        		case "empty" :
        			if (ad.isEmpty()) {
        				System.out.println(1);
        			} else {
        				System.out.println(0);
        			}
        			break;

        		case "front" :
        			if (ad.isEmpty()) {
        				System.out.println(-1);
        			} else {
        				System.out.println(ad.peekFirst());
        			}
        			break;

        		case "back" :
        			if (ad.isEmpty()) {
        				System.out.println(-1);
        			} else {
        				System.out.println(ad.peekLast());
        			}
        			break;
        	}
        }
    }
}