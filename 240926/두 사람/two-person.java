import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String sex1 = sc.next();
        char s1 = sex1.charAt(0);

        int num2 = sc.nextInt();
        String sex2 = sc.next();
        char s2 = sex2.charAt(0);

        if((num1>=19&&s1=='M')||(num2>=19&&s2=='M'))
            System.out.println(1);
        else
            System.out.println(0);
    }
}