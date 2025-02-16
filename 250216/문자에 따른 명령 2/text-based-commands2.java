import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] dx = new int[] { 1, 0, -1, 0 };
		int[] dy = new int[] { 0, -1, 0, 1 };

		int x = 0;
		int y = 0;
		int d = 3;

		String p = br.readLine();
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == 'L') {
				d = (d + 3) % 4;
			} else if (p.charAt(i) == 'R') {
				d = (d + 1) % 4;
			} else if (p.charAt(i) == 'F') {
				x = x + dx[d];
				y = y + dy[d];
			}
		}
		System.out.println(x + " " + y);
	}
}
