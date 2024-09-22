import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0)
            System.out.println("ice");
        else if(n >= 100)
            System.out.println("vapor");
        else
            System.out.println("water");
    }
}