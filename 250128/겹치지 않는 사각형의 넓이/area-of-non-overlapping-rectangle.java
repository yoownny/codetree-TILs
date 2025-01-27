import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[2001][2001];
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();

        for(int i = ax1+1000 ; i < ax2+1000 ; i++ ){
            for(int j = ay1+1000 ; j < ay2+1000 ; j++){
                num[i][j]++;
            }
        }

        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();

        for(int i = bx1+1000 ; i < bx2+1000 ; i++ ){
            for(int j = by1+1000 ; j < by2+1000 ; j++){
                num[i][j]++;
            }
        }

        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();

        for(int i = mx1+1000 ; i < mx2+1000 ; i++ ){
            for(int j = my1+1000 ; j < my2+1000 ; j++){
                if(num[i][j]!=0){
                    num[i][j] = 0;
                }
            }
        }

        int n = 0;
        for(int i = 0 ; i < 2001 ; i++){
            for(int j = 0 ; j < 2001 ; j++){
                if(num[i][j]==1){
                    n++;
                }
            }
        }

        System.out.println(n);

    }
}