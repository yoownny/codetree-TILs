import java.util.*;
import java.io.*;

public class Main {
	public static int isNum(int i, int j, int[][] box) {
		int num = 0;
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				num += box[i + a][j + b];
			}
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] box = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int max = 0;
		for (int i = 0; i <= N - 3; i++) {
			for (int j = 0; j <= N - 3; j++) {
				max = Math.max(max, isNum(i, j, box));
			}
		}
		System.out.println(max);
	}

}
