import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[10];
        for(int i = 0 ; i < 10 ;i++){
            input[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        for(int i = 0 ; i < 10 ; i++){
            if(input[i].charAt(input[i].length()-1)==c)
                System.out.println(input[i]);
        }
    }
}