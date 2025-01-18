import java.util.Scanner;

public class Main {
    private static int isPrint(int N){
        if(N == 1){
            return 1;
        }
        if(N == 2){
            return 1;
        }

        return isPrint(N-1) + isPrint(N-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(isPrint(N));

    }
}