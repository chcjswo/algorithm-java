package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2606">
 * https://www.acmicpc.net/problem/2606
 * </a>
 */
public class Q2606 {
	static boolean[][] graph;
	static boolean[] visited;
	static int n;
	static int m;
	static int answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		graph = new boolean[n + 1][n + 1];
		visited = new boolean[n + 1];

		int x;
		int y;
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			graph[x][y] = graph[y][x] = true;
		}

		dfs(1);

		bw.write(String.valueOf(answer - 1));

		br.close();
		bw.close();
	}

	private static void dfs(int index) {
		visited[index] = true;
		answer++;

		for (int i = 1; i <= n; i++) {
			if (graph[index][i] && !visited[i]) {
				dfs(i);
			}
		}
	}
}
