import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0 ; i < 10 ; i++ )
            a[i] = sc.nextInt();
        int sum = 0;
        double sum2 = 0;
        int cnt = 0;
        double avg = 0;

        for(int i = 0 ; i < 10 ; i++){
            if((i+1)%2==0)
                sum+=a[i];
            if((i+1)%3==0){
                sum2+=a[i];
                cnt++;
            }
        }

        avg = sum2 / cnt ;

        System.out.printf("%d %.1f",sum,avg);

    }
}