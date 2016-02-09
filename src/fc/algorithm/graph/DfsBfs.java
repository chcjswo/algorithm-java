package fc.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt();
		List<Integer>[] a = (List<Integer>[]) new List[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}

		for (int i = 1; i <= m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			a[u].add(v);
			a[v].add(u);
		}
		for (int i = 1; i <= n; i++) {
			Collections.sort(a[i]);
		}
		boolean[] c = new boolean[n + 1];
		dfs(a, c, start);
		System.out.println();
		Arrays.fill(c, false);
		bfs(a, c, start);
	}

	private static void dfs(List<Integer>[] a, boolean[] c, int start) {
		if (c[start])
			return;

		c[start] = true;
		System.out.print(start + " ");

		for (int val : a[start]) {
			if (!c[val]) {
				dfs(a, c, val);
			}
		}
	}

	private static void bfs(List<Integer>[] a, boolean[] c, int start) {
		Queue<Integer> data = new LinkedList<Integer>();
		data.add(start);
		c[start] = true;

		while (!data.isEmpty()) {
			int y = data.remove();
			System.out.print(y + " ");

			for (int val : a[start]) {
				if (!c[val]) {
					c[val] = true;
					data.add(val);
				}
			}
		}
	}

}