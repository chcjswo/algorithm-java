package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 연결 요소의 개수
 * https://www.acmicpc.net/problem/11724
 * <p>
 * 1. 방문하지 않은 노드를 찾는다.
 * 2. 방문하지 않은 노드를 시작으로 dfs를 돌린다.
 * 3. dfs를 돌릴 때마다 count를 증가시킨다.
 * 4. dfs가 끝나면 count를 출력한다.
 */
public class Q11724 {

	private static final int MAX = 1000 * 10;
	private static boolean[][] graph;
	private static boolean[] visited;
	private static int n;
	private static int m;
	private static int answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		graph = new boolean[MAX][MAX];
		visited = new boolean[MAX];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u][v] = true;
			graph[v][u] = true;
		}

		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				dfs(i);
				answer++;
			}
		}

		bw.write(String.valueOf(answer));

		bw.close();
		br.close();
	}

	private static void dfs(int index) {
		visited[index] = true;

		for (int i = 0; i <= n; i++) {
			if (graph[index][i] && !visited[i]) {
				dfs(i);
			}
		}
	}
}
