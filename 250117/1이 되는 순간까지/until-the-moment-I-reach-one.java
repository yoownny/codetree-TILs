import java.util.Scanner;

public class Main {
    static int num = 0;
    public static int isResult(int N){
        if(N == 1){
            return 0;
        }
        if(N%2==0){
            num++;
            return isResult(N/2);
        }
        else{
            num++;
            return isResult(N/3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        isResult(N);
        System.out.println(num);
    }
}