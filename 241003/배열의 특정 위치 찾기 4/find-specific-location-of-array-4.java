import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        int[] a = new int[10];
        for(int i = 0; i < 10 ; i++){
            a[i] = sc.nextInt();
            if(a[i]==0)
                break;
            if(a[i]%2==0){
                sum+=a[i];
                cnt++;
            }
        }     
        System.out.print(cnt + " " + sum);   
    }
}