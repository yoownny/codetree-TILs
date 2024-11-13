import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        int max = 0;
        for(int i = 0 ; i < 10 ; i++){
            input[i] = sc.nextInt();
            if(input[i]>max)
                max = input[i];
        }
        System.out.println(max);
        
    }
}