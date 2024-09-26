import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        if(A1<B1)
            System.out.println("B");
        else if(A1>B1)
            System.out.println("A");
        else{
            if(A2<B2)
                System.out.println("B");
            else
                System.out.println("A");
        }
    }
}