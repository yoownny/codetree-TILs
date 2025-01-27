import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int[][] box = new int[201][201];
        for(int i = 0 ; i < n ; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int a = x1 + 100 ; a < x2+100 ; a++){
                for(int b = y1 + 100 ; b < y2 + 100 ; b++){
                    box[a][b]++;
                }
            }
        }
        for(int a = 0 ; a < 201 ; a++){
                for(int b = 0 ; b < 201 ; b++){
                    if(box[a][b]>0){
                        num++;
                    }
                }
            }
        System.out.println(num);
    }
}