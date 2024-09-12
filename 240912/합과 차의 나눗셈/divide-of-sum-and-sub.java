import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = a + b;
        double d = a - b;
        System.out.printf("%.2f",c/d);
    }
}