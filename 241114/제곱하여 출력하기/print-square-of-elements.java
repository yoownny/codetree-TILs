import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0 ; i < n ; i++){
            input[i] = sc.nextInt();
            System.out.print(input[i]*input[i]+" ");
        }
    }
}