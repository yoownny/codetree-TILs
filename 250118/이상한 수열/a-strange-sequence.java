import java.util.Scanner;

public class Main {
    public static int isResult(int N){
        if(N==1){
            return 1;
        }
        if(N==2){
            return 2;
        }
        return isResult(N/3) + isResult(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(isResult(N));
    }
}