import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= 2*n ; i++){
            if(i%2==1){
                for(int j = 1 ; j <= i/2+1 ; j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int k = 1 ; k <= n-(i/2)+1 ; k++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}