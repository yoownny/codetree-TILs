import java.util.Scanner;

public class Main {
    public static boolean isYear(int y){
        if(y % 4 != 0){
            return false;
        }
        if(y % 100 == 0 && y % 400 != 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(isYear(y)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}