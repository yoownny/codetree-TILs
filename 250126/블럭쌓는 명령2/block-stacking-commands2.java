import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] block = new int[N];
        for(int i = 0 ; i < K ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a-1 ; j < b ; j++){
                block[j]++;
            }
        }
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            if(max < block[i]){
                max = block[i];
            }
        }
        System.out.println(max);
    }
}