import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(isYes(n) == 5){
            if(n % 2 === 0){
                System.out.println("Yes");
            }
        }
        else{
            System.out.println("No");
        }
    }

    public static int isYes(int n){
       int sum = 0;

       int num = n;
       while(num > 0){
        sum += (num % 10);
        num /= 10;
       }

       return sum;
    }
}