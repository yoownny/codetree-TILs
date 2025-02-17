import java.io.*;
import java.util.*;

public class Main {
	static int[] result;
	static boolean[] visited;
	static int N;
	static StringBuffer sb = new StringBuffer();

	public static void isPrint(int num) {
		if (num == N) {
			for (int i = 0; i < N; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				result[num] = i;
				isPrint(num + 1);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		result = new int[N];
		visited = new boolean[N + 1];

		isPrint(0);
		System.out.println(sb);

	}
}
