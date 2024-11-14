import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] result = new int[n][n];
        int m = sc.nextInt();

        for(int i = 0 ; i < m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            result[--a][--b] = 1;
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}