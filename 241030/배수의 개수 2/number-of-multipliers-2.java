import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            A[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i = 0 ; i < 10 ; i++){
            if(A[i]%2==1)
                cnt++;
        }
        System.out.println(cnt);
    }
}