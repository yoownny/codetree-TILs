import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char n = sc.next().charAt(0);
        int flag = 0;
        for(int i = 0 ; i < 6 ; i++ ){
            if(word[i]==n){
                System.out.println(i);
                flag = 1;
                break;
            }
        }
        if(flag==0)
            System.out.println("None");
        
    }
}