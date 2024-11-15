import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] input = new String[n];
        String result = "";
        for(int i = 0 ; i < n ; i++ ){
            input[i] = sc.next();
            result += input[i];
        }
        for(int i = 0 ; i <= result.length() ; i+=5 ){
            for(int j = 0 ; j < 5 && i+j < result.length() ; j++){
                System.out.print(result.charAt(j + i));
            }
            System.out.println();
        }

    }
}