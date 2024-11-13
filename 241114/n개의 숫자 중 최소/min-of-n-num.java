import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        input[0] = sc.nextInt();
        int min = input[0];
        int cnt = 1;
        for(int i = 1 ; i < n ; i++ ){
            input[i] = sc.nextInt();
            if(min == input[i])
                cnt++;
                
            if(min > input[i]){
                min = input[i];
                cnt = 1;
            }
           
        }
        System.out.println(min + " " + cnt);
    }
}