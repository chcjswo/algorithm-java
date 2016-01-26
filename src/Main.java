import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int mod = 2;
		n = Integer.parseInt(String.valueOf(n), 8);
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		while (n != 0) {
			data.add(n%mod);
			n = n / mod;
		}
		
		for (int i=data.size()-1; i>=0; i--) {
			System.out.print(data.get(i));
		}
	}

}