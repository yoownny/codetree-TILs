import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] sum = new double[n];
        String[] result = new String[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sum[i] = (a + b + c + d)/4.0;
        }
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(sum[i]>=60){
                result[i] = "pass";
                cnt++;
            }
            else
                result[i] = "fail";
        }
        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }
        System.out.println(cnt);

    }
}