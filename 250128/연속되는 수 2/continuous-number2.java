import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int max = 0;
        int cnt = 0;
        for(int i = 0 ; i < N ; i++ ){
            num[i] = sc.nextInt();
            if(i == 0 || num[i-1] == num[i]){
                cnt++;
            }
            else{
                cnt = 1;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}