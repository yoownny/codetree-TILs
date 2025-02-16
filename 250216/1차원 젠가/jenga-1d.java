import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> block = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			block.add(Integer.parseInt(br.readLine()));
		}

		st = new StringTokenizer(br.readLine(), " ");
		int s1 = Integer.parseInt(st.nextToken());
		int e1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int s2 = Integer.parseInt(st.nextToken());
		int e2 = Integer.parseInt(st.nextToken());

		block.subList(s1 - 1, e1).clear();
		block.subList(s2 - 1, e2).clear();

		System.out.println(block.size());
		for (int i = 0; i < block.size(); i++) {
			System.out.println(block.get(i));
		}
	}
}
