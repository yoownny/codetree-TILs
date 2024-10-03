import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        double sum = 0;
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        double result = sum/n;
        System.out.printf("%.1f\n",result);
        if(result>=4.0)
            System.out.println("Perfect");
        else if (result>=3.0)
            System.out.println("Good");
        else
            System.out.println("Poor");
        
    }
}