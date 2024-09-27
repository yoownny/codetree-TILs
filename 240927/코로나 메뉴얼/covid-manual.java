import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char A = sc.next().charAt(0);
        int An = sc.nextInt();
        char B = sc.next().charAt(0);
        int Bn = sc.nextInt();
        char C = sc.next().charAt(0);
        int Cn = sc.nextInt();
        int num = 0;

        if(A == 'Y' && An >= 37)
            num++;
        if(B == 'Y' && Bn >= 37)
            num++;
        if(C == 'Y' && Cn >= 37)
            num++;

        if(num >= 2)
            System.out.println("E");
        else
            System.out.println("N");
    }
}