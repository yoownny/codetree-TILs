import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        input[0] = sc.nextInt();
        input[1] = sc.nextInt();
        for(int i = 2 ; i < 10 ; i++){
            input[i] = (input[i-1] + input[i-2])%10;
        }
        for(int i = 0 ; i < 10 ; i++){
            System.out.print(input[i]+" ");
        }
    }
}