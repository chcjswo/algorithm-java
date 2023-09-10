package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1260">
 * https://www.acmicpc.net/problem/1260
 * </a>
 */
public class Q1260 {

	static int MAX = 1000 + 10;
	static boolean[][] graph;
	static boolean[] visited;
	static ArrayList<Integer> queue;
	static int n;
	static int m;
	static int v;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());

		graph = new boolean[MAX][MAX];
		visited = new boolean[MAX];
		queue = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = graph[y][x] = true;
		}

		dfs(v);
		System.out.println();

		br.close();
		bfs();
	}

	private static void bfs() {
		queue = new ArrayList<>();
		visited = new boolean[MAX];

		queue.add(v);
		visited[v] = true;

		while (!queue.isEmpty()) {
			int index = queue.remove(0);
			System.out.print(index + " ");

			for (int i = 1; i <= n; i++) {
				if (graph[index][i] && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}

	private static void dfs(int index) {
		visited[index] = true;
		System.out.print(index + " ");

		for (int i = 1; i <= n; i++) {
			if (graph[index][i] && !visited[i]) {
				dfs(i);
			}
		}
	}
}
