import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            A[i] = sc.nextInt();
        }
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0 ; i < 10 ; i++){
            if(A[i]%3==0)
                cnt1++;
            if(A[i]%5==0)
                cnt2++;
        }
        System.out.println(cnt1 + " " + cnt2);
    }
}