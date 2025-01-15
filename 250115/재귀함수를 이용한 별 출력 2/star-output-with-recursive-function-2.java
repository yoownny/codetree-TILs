import java.util.Scanner;

public class Main {
    public static void printRight(int N){
        if(N == 0){
            return ;
        }
        for(int i = 0 ; i < N ; i++ ){
            System.out.print("* ");
        }
        System.out.println();
        printRight(N-1);
    }
    public static void printReverse(int N){
        if(N == 0){
            return ;
        }
        printReverse(N-1);
        for(int i = 0 ; i < N ; i++ ){
            System.out.print("* ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printRight(N);
        printReverse(N);
    }
}