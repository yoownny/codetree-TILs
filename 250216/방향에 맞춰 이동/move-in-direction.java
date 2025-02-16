import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] dx = new int[] { 1, 0, -1, 0 };
		int[] dy = new int[] { 0, -1, 0, 1 };
		int x = 0;
		int y = 0;

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			char d = st.nextToken().charAt(0);
			int n = Integer.parseInt(st.nextToken());

			if (d == 'E') {
				x = x + dx[0] * n;
				y = y + dy[0] * n;
			} else if (d == 'S') {
				x = x + dx[1] * n;
				y = y + dy[1] * n;
			} else if (d == 'W') {
				x = x + dx[2] * n;
				y = y + dy[2] * n;
			} else if (d == 'N') {
				x = x + dx[3] * n;
				y = y + dy[3] * n;
			}
		}

		System.out.println(x + " " + y);

	}
}
