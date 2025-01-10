import java.util.Scanner;

public class Main {
    public static void isCalc(int a, char b, int c){
        if(b == '+'){
            System.out.println(a + " " + b + " " + c + " = " + (a+c));
            return ;
        }
        if(b == '-'){
            System.out.println(a + " " + b + " " + c + " = " + (a-c));
            return ;
        }
        if(b == '/'){
            System.out.println(a + " " + b + " " + c + " = " + (a/c));
            return ;
        }
        if(b == '*'){
            System.out.println(a + " " + b + " " + c + " = " + (a*c));
            return ;
        }
        System.out.println("False");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        isCalc(a, b, c);
    }
}