import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String str = sc.next();
            if(str.equals("push")){
                int n = sc.nextInt();
                st.push(n);
            }else if(str.equals("pop")){
                System.out.println(st.pop());
            }else if(str.equals("size")){
                System.out.println(st.size());
            }else if(str.equals("empty")){
                if(st.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(str.equals("top")){
                System.out.println(st.peek());
            }
        }
    }
}