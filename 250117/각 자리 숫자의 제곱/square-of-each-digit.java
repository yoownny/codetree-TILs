import java.util.Scanner;

public class Main {
    public static int print(int N){
        if(N < 10){
            return N*N;
        }
        return print(N/10) + (N%10)*(N%10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(print(N));
    }
}