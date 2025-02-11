import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> queue = new ArrayList<Integer>();
        for(int i = 0 ; i < N ; i++){
            queue.add(i);
        }

        while(queue.size() > 0){
            for(int i = 0 ; i < K-1 ; i++){
                queue.add(queue.get(0));
                queue.remove(0);
            }
            System.out.print((queue.remove(0) + 1)+" ");
        }
    }
}