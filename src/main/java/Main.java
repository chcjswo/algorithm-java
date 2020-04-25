import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int m = sc.nextInt();
		int[] c = new int[m];

		List<Integer> data = new ArrayList<Integer>();

		while (m-- > 0) {
			int s = sc.nextInt();
			data.add(s);
			binarySearch(s, a, c, data);
		}

		for (int val : c) {
			System.out.print(val + " ");
		}
	}

	private static void binarySearch(int s, int[] a, int[] c, List<Integer> data) {
		int left = 0;
		int right = a.length-1;

		while (left <= right) {
			int mid = (left + right) / 2;
			int val = a[mid];

			if (s == val) {
				c[data.indexOf(s)] = c[data.indexOf(s)] + 1;
				//return;
			} else if (val > s) {
				right = mid - 1;
			} else if (val < s) {
				left = mid + 1;
			} else {
				return;
			}
		}
	}

}
