import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int num = 1;
        
        for(int sum = 0 ; sum < n+m-1 ; sum++){
            for(int i = 0 ; i < n ; i++){
                int j = sum - i;
                if(j>=0 && j<m){
                    arr[i][j] = num;
                    num++;
                }
            }
        }
        
        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}