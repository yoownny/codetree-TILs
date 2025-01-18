import java.util.Scanner;

public class Main {
    public static int isFind(int n, int[] num){
        if(n == 0){
            return num[0];
        }
        return Math.max(isFind(n-1,num),num[n]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            num[i] = sc.nextInt();
        }
        int max = num[0];
        System.out.println(isFind(n-1, num));
    }
}