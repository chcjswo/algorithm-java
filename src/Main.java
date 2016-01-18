import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        sc.nextLine();
        Stack<String> data = new Stack<String>();
        
        while (tc-- > 0) {
        	String line = sc.nextLine();
        	for (int i=0; i<line.length(); i++) {
        		String ps = line.substring(i, i+1);
        		System.out.println(ps);
        		//if ()
        		data.push(ps);
        	}
        	System.out.println(data.empty());
        }
    }
}