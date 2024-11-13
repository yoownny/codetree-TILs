import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for(int i = 0 ; i < n ; i++){
            input[i] = sc.nextInt();
        }

        int[] num = new int[9];
        for(int j = 0 ; j < 9 ; j++ ){
            for(int i = 0 ; i < n ; i++){
                if((j+1)==input[i])
                    num[j]+=1;
            }
            System.out.println(num[j]);
        }
    }
}