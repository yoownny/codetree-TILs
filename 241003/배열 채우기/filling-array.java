import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int cnt = 0;
        for(int i = 0 ; i < 10 ; i++){
            a[i] = sc.nextInt();
            cnt++;
            if(a[i]==0){
                cnt--;
                break;
            }
        }
        for(int i = cnt-1 ; i >= 0 ; i --)
            System.out.print(a[i] + " ");
    }
}