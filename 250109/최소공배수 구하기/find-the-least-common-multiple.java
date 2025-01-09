import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printResult(n, m);
    }

    public static void printResult(int n , int m){
        int min = n;
        int max = m;
        if(n > m){
            min = m;
            max = n;
        }
        for(int i = 1; ; i++){
            int a = max * i;
            for(int j = 1; ; j++){
                int b = min * j;
                if(a == b){
                    System.out.println(a);
                    return;
                }
                if(a < b)
                    break;
            }
        }
    }
}