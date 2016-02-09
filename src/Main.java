import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i=0; i<n; i++)
		while (n-- > 0) {
			a[i] = sc.nextInt();
		}

		int m = sc.nextInt();

		while (m-- > 0) {
			int s = sc.nextInt();
			System.out.print(binarySearch(s, a) + " ");
		}
	}
	
	private static int binarySearch(int s, int[] a) {

		int left = 0;
		int right = a.length-1;

		while (left <= right) {
			int mid = (left + right) / 2;
			int val = a[mid];
			
			if (s == val) {
				return 1;
			} else if (val > s) {
				right = mid - 1;
			} else if (val < s) {
				left = mid + 1;
			}
		}
		
		return 0;
	}

}