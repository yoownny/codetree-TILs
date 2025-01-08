import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printResult(n, m);
    }

    public static void printResult(int n, int m){
        int max = 1;
        int min = n;
        if(n > m){
            min = m;
        }

        for(int i = 2; i < min; i++){
            if(n % i == 0 && m % i == 0){
                if(max < i){
                    max = i;
                }
            }
        }
        System.out.println(max);
    }
}