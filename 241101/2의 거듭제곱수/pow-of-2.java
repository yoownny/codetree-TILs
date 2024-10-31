import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 0;
        while(true){
            int n = x;
            int result = 1;
            while(n > 0){
                result *= 2;
                n--;
            }
            if(result == N)
                break;
            x++;
        }
        System.out.println(x);
    }
}