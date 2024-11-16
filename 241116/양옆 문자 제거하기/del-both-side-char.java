import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = str.substring(0,1);
        String str2 = str.substring(2, str.length()-2);
        String str3 = str.substring(str.length()-1);
        System.out.println(str1 + str2 + str3);
    }
}