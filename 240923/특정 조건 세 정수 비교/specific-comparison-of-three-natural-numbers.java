import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = 100;

        if(a < min){
            min = a;
        }
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }

        if(a == min)
            System.out.print(1);
        else
            System.out.print(0);


        System.out.print(" ");
        if(a==b && b==c)
            System.out.print(1);
        else
            System.out.print(0);
    }
}