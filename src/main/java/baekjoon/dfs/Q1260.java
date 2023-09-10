package baekjoon.dfs;

import java.io.BufferedReader;
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

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
	}
}
