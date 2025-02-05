import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        char[] c = line.toCharArray();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                st.push(c[i]);
            } else if (c[i] == ')') {
                if (st.isEmpty()) {
                    System.out.println("No");
                    return;
                }
                st.pop();
            }
        }

        if (st.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
