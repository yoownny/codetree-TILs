import java.io.*;
import java.util.*;

public class Main {
	static int[] result;
	static boolean[] visited;
	static int K;
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

		for (int i = 1; i <= K; i++) {
			if (num >= 2 && (result[num - 2] == result[num - 1]) && (result[num - 1] == i)) {
				continue;
			}
			result[num] = i;
			isPrint(num + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		result = new int[N];
		visited = new boolean[K + 1];

		isPrint(0);
		System.out.println(sb);

	}
}
