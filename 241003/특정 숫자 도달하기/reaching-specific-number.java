import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        double count = 0;
        for(int i = 0 ; i < 10 ; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < 10 ; i++){
            if(a[i]<250){
                sum+=a[i];
                count++;
            }
            else{
                break;
            }
        }
        System.out.printf("%d %.1f",sum,sum/count);
    }
}