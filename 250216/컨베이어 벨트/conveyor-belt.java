import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());

		int[] belt = new int[n * 2];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			belt[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = n; i < 2 * n; i++) {
			belt[i] = Integer.parseInt(st.nextToken());
		}

		while (t > 0) {
			int tmp = belt[2 * n - 1];
			for (int i = 2 * n - 1; i > 0; i--) {
				belt[i] = belt[i - 1];
			}
			belt[0] = tmp;
			t--;
		}

		for (int i = 0; i < 2 * n; i++) {
			if (i == n) {
				sb.append("\n");
			}
			sb.append(belt[i]).append(" ");
		}

		System.out.println(sb);
	}
}
