import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] A = new long[1000000];
        long[] B = new long[1000000];
        int cnt1 = 0;
        long station = 0;
        int cnt2 = 0;
        long station2 = 0;

        for(int i = 0 ; i < N ; i++ ){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            if(d == 'L'){
                while(t > 0){
                    station--;
                    A[cnt1] = (long)station;
                    cnt1++;
                    t--;
                }
            }else if(d == 'R'){
                while(t > 0){
                    station++;
                    A[cnt1] = (long)station;
                    cnt1++;
                    t--;
                }
            }
        }

        for(int i = 0 ; i < M ; i++ ){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            if(d == 'L'){
                while(t > 0){
                    station2--;
                    B[cnt2] = (long)station2;
                    cnt2++;
                    t--;
                }
            }else if(d == 'R'){
                while(t > 0){
                    station2++;
                    B[cnt2] = (long)station2;
                    cnt2++;
                    t--;
                }
            }
        }

        int flag = 0;
        for(int i = 0 ; i < cnt1 ; i++){
            if(A[i] == B[i]){
                System.out.println(i+1);
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println(-1);
        }
    }
}