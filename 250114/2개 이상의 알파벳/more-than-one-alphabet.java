import java.util.Scanner;

public class Main {
    public static boolean isTrue(String A){
        for(int i = 1 ; i < A.length() ; i++){
            if(A.charAt(0) != A.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean result = isTrue(A);
        if(result){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}