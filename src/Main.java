import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i=1; i <=n; i++) {
        	int count = n-i;
        	int loop = 1;
        	for (int j=1; j<=n*2-1; j++) {
        		if (count > 0) {
        			System.out.print(" ");
        			count--;
        		} else if (count == 0) {
        			System.out.print("*");
        			count = n-i; 
        		} else {
        			System.out.print("*");
        			count--; 
        		}
        	}
        	System.out.println("");
        }
    }

}