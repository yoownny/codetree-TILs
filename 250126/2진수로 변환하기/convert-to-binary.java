import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bit = new int[20];
        int cnt = 0;
        while(true){
            if(n < 2){
                bit[cnt] = n;
                break;
            }
            bit[cnt] = n%2;
            cnt++;
            n/=2;
        }
        for(int i = cnt ; i >= 0 ;i--){
            System.out.print(bit[i]);
        }
    }
}