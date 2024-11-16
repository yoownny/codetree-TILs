import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result;
        String str1 = str.substring(0,1);
        String str2 = str.substring(1);
        result = str2 + str1;
        System.out.println(result);
    }
}