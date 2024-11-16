import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String AB = A+B;
        String BA = B+A;
        int a = Integer.parseInt(AB);
        int b = Integer.parseInt(BA);
        System.out.println(a+b);
    }
}