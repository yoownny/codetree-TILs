import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a/b);
        System.out.print(".");
        a = a % b;
        for(int i = 0 ; i < 20 ; i++){
            a = a * 10;
            System.out.print(a/b);
            a = a % b ;
        }
    }
}