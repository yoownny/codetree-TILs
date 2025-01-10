import java.util.Scanner;

public class Main {
    public static boolean isTrue(int M, int D){
        if(M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12){
            if(D > 0 && D <= 31){
                return true;
            }
        }
        else if(M == 2){
            if(D > 0 && D <= 28){
                return true;
            }
        }
        else if(M == 4 || M == 6 || M == 9 || M == 11){
            if(D > 0 && D <= 30){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        boolean result = isTrue(M, D);
        if(result){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}