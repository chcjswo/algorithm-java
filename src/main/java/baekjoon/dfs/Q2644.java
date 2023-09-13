package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2644">
 * https://www.acmicpc.net/problem/2644
 * </a>
 */
public class Q2644 {
	static final int MAX = 100 + 10;
	static boolean[][] graph;
	static boolean[] visited;
	static int n;
	static int m;
	static int start;
	static int end;
	static int answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(br.readLine());

		graph = new boolean[MAX][MAX];
		visited = new boolean[MAX];
		answer = -1;

		int x;
		int y;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			graph[x][y] = graph[y][x] = true;
		}

		dfs(start, 0);

		bw.write(String.valueOf(answer));

		bw.close();
		br.close();
	}

	private static void dfs(int index, int count) {
		visited[index] = true;

		if (index == end) {
			answer = count;
			return;
		}

		for (int i = 1; i <= n; i++) {
			if (graph[index][i] && !visited[i]) {
				dfs(i, count + 1);
			}
		}
	}
}
