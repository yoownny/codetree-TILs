import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[200];
        for(int i = 0 ; i < n ; i++ ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a ; j < b ; j++ ){
                line[j+100]++;
            }
        }
        int max = 0;
        for(int i = 0 ; i < 200 ; i++){
            if(max < line[i]){
                max = line[i];
            }
        }
        System.out.println(max);
    }
}