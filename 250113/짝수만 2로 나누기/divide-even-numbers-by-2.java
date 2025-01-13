import java.util.Scanner;

public class Main {
    public static void modify(int[] N){
        for(int i = 0 ; i < N.length ; i++){
            if(N[i]%2==0){
                N[i] /= 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        for(int i = 0 ; i < n ; i++){
            N[i] = sc.nextInt();
        }
        modify(N);
        for(int i = 0 ; i < n ; i++){
            System.out.print(N[i] + " ");
        }
    }
}