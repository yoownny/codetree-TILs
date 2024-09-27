import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = -100;
        if(a > max)
            max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        System.out.println(max);
    }
}