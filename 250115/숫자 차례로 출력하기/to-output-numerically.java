import java.util.Scanner;

public class Main {
    public static void printLine(int N){
        if(N==0)
            return;
        printLine(N-1);
        System.out.print(N + " ");
    }

    public static void printReverse(int N){
        if(N==0)
            return;
        System.out.print(N + " ");
        printReverse(N-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printLine(N);
        System.out.println();
        printReverse(N);
    }
}