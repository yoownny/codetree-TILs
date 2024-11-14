import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = new int[4][4];
        int[] cnt = new int[4];
        for(int i = 0 ; i < 4 ; i++ ){
            for(int j = 0 ; j < 4 ; j++ ){
                input[i][j] = sc.nextInt();
                cnt[i]+=input[i][j];
            }
        }
        for(int i = 0 ; i < 4 ; i++){
            System.out.println(cnt[i]);
        }
    }
}