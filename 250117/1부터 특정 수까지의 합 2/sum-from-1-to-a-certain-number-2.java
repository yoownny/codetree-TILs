import java.util.Scanner;

public class Main {
    public static int isResult(int N){
        if(N == 1){
            return 1;
        }
        return N + isResult(N-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = isResult(N);
        System.out.println(sum);
    }
}