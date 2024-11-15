import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[10];
        int cnt = 0;
        for(int i = 0 ; i < 10 ; i++ ){
            input[i] = sc.next();
            cnt += input[i].length();
        }
        System.out.println(cnt);
    }
}