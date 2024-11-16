import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        char[] result = str.toCharArray();
        result[1] = 'a';
        result[result.length-2] = 'a';
        System.out.println(String.valueOf(result));
    }
}