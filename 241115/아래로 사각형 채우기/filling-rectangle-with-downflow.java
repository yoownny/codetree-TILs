import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] result = new int[n][n];
        int num = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                result[i][j] = num;
                num++;
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(result[j][i] + " ");
            }
            System.out.println();
        }
    }
}