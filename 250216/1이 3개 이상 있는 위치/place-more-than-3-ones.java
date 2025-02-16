import java.io.*;
import java.util.*;

public class Main {
	static int N;

	public static boolean isRange(int nx, int ny) {
		boolean result = false;

		if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		int[][] box = new int[N][N];

		int[] dx = new int[] { 1, 0, -1, 0 };
		int[] dy = new int[] { 0, -1, 0, 1 };

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int cnt = 0;
				for (int d = 0; d < 4; d++) {
					int nx = j + dx[d];
					int ny = i + dy[d];
					if (isRange(nx, ny) && box[nx][ny] == 1)
						cnt++;
				}
				if (cnt >= 3)
					result++;
			}
		}

		System.out.println(result);

	}
}
