import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String satisfied = "P";
        for(int i = 2 ; i <= n-1 ; i++ ){
            if(n % i == 0){
                satisfied = "C";
            }
        }
        System.out.println(satisfied);
    }
}