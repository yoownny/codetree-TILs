import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int [10];
        for(int i = 0 ; i< 10 ; i++)
            a[i] = sc.nextInt();
        int sum = 0;
        sum += a[2] + a[4] + a[9];
        System.out.println(sum);
    }
}