import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        for(int i = 0 ; i < 10 ; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println(sum);
    }
}