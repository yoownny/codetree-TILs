import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner;
        int n = sc.nextInt();
        char result = 'N';
        for(int i = 2 ; i <= n-1 ; i++) {
            if(n % i == 0){
                result = 'Y';
                break;
            }
        }
        System.out.println(result);
    }
}