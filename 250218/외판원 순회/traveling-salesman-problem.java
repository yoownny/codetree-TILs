import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[][] road;
	static boolean[] visited;
	static int minCost = Integer.MAX_VALUE;

	public static void tsp(int start, int current, int cnt, int cost) {
		if (cnt == N) {
			cost += road[current][start];
			minCost = Math.min(minCost, cost);
		}
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				tsp(start, i, cnt + 1, cost + road[current][i]);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		road = new int[N][N];
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				road[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		visited[0] = true;
		tsp(0, 0, 1, 0);
		
		System.out.println(minCost);

	}
}
