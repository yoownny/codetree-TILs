import java.util.Scanner;

public class Main {
    public static int isCal(int n, int m, int[] A){
        int sum = A[m-1];
        while(m > 1){
            if(m % 2 == 0){
                m /= 2;
                sum += A[m-1];

            }
            else{
                m--;
                sum += A[m-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }
        int sum = isCal(n, m, A);
        System.out.println(sum);
    }
}