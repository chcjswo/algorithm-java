import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextInt();
		long y = sc.nextInt();
		
		String a = "";
		String b = "";
		
		for (int i=0; i<x; i++) {
			a = a + "1";
		}
		for (int i=0; i<y; i++) {
			b = b + "1";
		}
		
		System.out.println(gcd(Long.parseLong(a), Long.parseLong(b)));
	}

	static long gcd(long x, long y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}

	}

}