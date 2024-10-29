import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            if(i % 3 == 0){
                System.out.print(0 + " ");
            }
            else if(calculate(i)){
                System.out.print(0 + " ");
            }
            else{
                System.out.print(i + " ");
            }
        }
    }
    public static boolean calculate(int i) {
        while(i > 0){
            int a = i % 10 ;
            if(a == 3 || a == 6 || a == 9)
                return true;
            i = i / 10;
        }
        return false;
    }
}