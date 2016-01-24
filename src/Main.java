import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n;
	static ArrayList<Integer> data = new ArrayList<Integer>(1001);
	static boolean checks[];
	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        
        for (int i=0; i<m; i++) {
        	int from = sc.nextInt();
        	int to = sc.nextInt();
        	
        	data.add(i, from);
        	data.add(from, to);
        }

        for (int i=0; i<data.size(); i++) {
        	System.out.println("from == " + data.get(i));
        	System.out.println("to == " + data.get(data.get(i)));
        }
        
        dfs(start);
        System.out.println("");
        bfs(start);
        
    }
    
    static void dfs(int x) {
    	for (int i=0; i<n; i++) {
    		checks[i] = true;
    		System.out.print(data.get(i));
    		
    		if (!checks[i]) {
    			dfs(i);
    		}
    	}
    }
    
    static void bfs(int x) {
    	Queue<Integer> queue = new LinkedList<Integer>();
    	
    	for (int i=0; i<n; i++) {
    		if (!queue.isEmpty()) {
    			checks[i] = true;
    			queue.add(i);
    			System.out.print(i + " ");
    		}
    	}
    }

}