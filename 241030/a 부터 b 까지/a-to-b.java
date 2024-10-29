import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        while(i <= b){
            System.out.print(i + " ");

            if(i % 2 == 1){
                i = i * 2 ;
            }
            else{
                i = i + 3;
            }
        }
    }
}