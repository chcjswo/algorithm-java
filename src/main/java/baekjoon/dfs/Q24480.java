package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2448">
 * https://www.acmicpc.net/problem/24480
 * </a>
 */
public class Q24480 {

	static int MAX = 100000 + 10;
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int n;
	static int m;
	static int r;
	static int[] answer;
	static int order;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());

		graph = new ArrayList[MAX];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}
		visited = new boolean[MAX];
		answer = new int[MAX];
		order = 1;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x].add(y);
			graph[y].add(x);
		}

		for (int i = 0; i < n; i++) {
			Collections.sort(graph[i], Collections.reverseOrder());
		}

		dfs(r);

		for (int i = 0; i < n; i++) {
			bw.write(String.valueOf(answer[i]));
			bw.newLine();
		}

		bw.close();
		br.close();
	}

	private static void dfs(int r) {
		visited[r] = true;
		answer[r] = order++;

		for (int i = 0; i < graph[r].size(); i++) {
			int next = graph[r].get(i);
			if (!visited[next]) {
				dfs(next);
			}
		}
	}
}
