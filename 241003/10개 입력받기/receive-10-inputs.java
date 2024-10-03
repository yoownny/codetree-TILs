import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        double cnt = 0;
        int sum = 0;
        for(int i = 0 ; i < 10 ; i++){
            a[i] = sc.nextInt();
            if(a[i]==0)
                break;
            cnt++;
            sum+=a[i];
        }
        System.out.printf("%d %.1f",sum,sum/cnt);
    }
}