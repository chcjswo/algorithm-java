import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        sc.nextLine();
        
        int size = 0;
        int[] data = new int[10000];
        
        while (tc-- >0) {
        	String[] arr = sc.nextLine().split(" ");
        	String cmd = arr[0];
        	
        	switch (cmd) {
        		case "push" :
        			int x = Integer.parseInt(arr[1]);
        			break;

        		case "pop" :
        			break;

        		case "size" :
        			break;

        		case "empty" :
        			if (empty(size)) System.out.println(1);
        			else System.out.println(0);
        			break;

        		case "front" :
        			break;

        		case "back" :
        			break;
        	}
        }
    }
    
    static boolean empty(int size) {
    	if (size == 0) return true;
    	
    	return false;
    }
}