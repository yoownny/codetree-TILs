import java.io.*;
import java.util.*;

public class Main {
	static int N;

	public static boolean isRange(int nx, int ny) {
		return nx >= 0 && nx <= N - 1 && ny >= 0 && ny <= N - 1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());

		int[] dx = new int[] { 1, 0, -1, 0 };
		int[] dy = new int[] { 0, 1, 0, -1 };

		st = new StringTokenizer(br.readLine(), " ");
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		char D = st.nextToken().charAt(0);

		int d = 0;
		if (D == 'R')
			d = 0;
		else if (D == 'D')
			d = 1;
		else if (D == 'L')
			d = 2;
		else if (D == 'U')
			d = 3;

		int y = R - 1;
		int x = C - 1;

		while (T > 0) {
			int nx = x + dx[d];
			int ny = y + dy[d];

			if (isRange(nx, ny)) {
				x = nx;
				y = ny;
				//System.out.println((y + 1) + " " + (x + 1));
			} else {
				d = (d + 2) % 4;
				//System.out.println((y + 1) + " " + (x + 1));
			}
			T--;
		}

		System.out.println((y + 1) + " " + (x + 1));

	}
}
