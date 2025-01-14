import java.util.Scanner;

public class Main {
    public static boolean isPanlin(String A){
        int n = A.length();
        for(int i = 0 ; i < n/2 ; i++){
            if(A.charAt(i) != A.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean result = isPanlin(A);
        if(result){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}