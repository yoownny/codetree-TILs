import java.util.Scanner;

public class Main {
    public static boolean isYes(int a, int b, int[] A, int[] B){
        for(int i = 0 ; i <= a-b ; i++){
            boolean match = true;
            for(int j = 0 ; j < b ; j++){
                if(A[i+j] != B[j]){
                    match = false;
                    break;
                }
            }
            if(match){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] A = new int[a];
        int[] B = new int[b];
        
        for(int i = 0 ; i < a ; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0 ; i < b ; i++){
            B[i] = sc.nextInt();
        }

        Boolean result = isYes(a, b, A, B);

        if(result){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}