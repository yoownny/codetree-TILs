import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int result = 1;
        for(int i = 1 ; i <= 100 ; i++ ){
            if(sum >= n)
                break;
            result = i;
            sum += i;
        }
        System.out.println(result);
    }
}