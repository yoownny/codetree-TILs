import java.io.*;
import java.util.*;

public class Main {
	static int N;

	// 격자 범위 확인 함수
	public static boolean isRange(int nx, int ny) {
		return nx >= 0 && nx < N && ny >= 0 && ny < N;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());

		// 방향 배열 수정 (U, D, R, L 순서)
		int[] dx = { 0, 0, 1, -1 };  // {U, D, R, L}
		int[] dy = { -1, 1, 0, 0 };  // {U, D, R, L}

		st = new StringTokenizer(br.readLine(), " ");
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		char D = st.nextToken().charAt(0);

		// 방향 매핑 수정
		int d = 0;
		if (D == 'U') d = 0;
		else if (D == 'D') d = 1;
		else if (D == 'R') d = 2;
		else if (D == 'L') d = 3;

		// (1-based) 입력값을 (0-based)로 변환
		int y = R - 1;
		int x = C - 1;

		while (T > 0) {
			int nx = x + dx[d];
			int ny = y + dy[d];

			if (isRange(nx, ny)) {
				x = nx;
				y = ny;
			} else {
				d = (d + 2) % 4; // 방향 반대로 변경
			}
			T--;
		}

		// (0-based) 좌표를 (1-based)로 변환하여 출력
		System.out.println((y + 1) + " " + (x + 1));
	}
}
