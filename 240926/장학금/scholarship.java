import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>=90){
            if(num2>=95)
                System.out.println(10);
            else if(num2>=90)
                System.out.println(5);
            else
                System.out.println(0);
        }
        else
            System.out.println(0);
    }
}