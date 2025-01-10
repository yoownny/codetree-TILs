import java.util.Scanner;

public class Main {
    public static boolean isPrime(int i){
        if(i == 1){
            return false;
        }

        for(int j = 2 ; j < i ; j++){
            if(i % j == 0){
                return false;
            }
        }

        return true;
    }

    public static int isNum(int i){
        int sum = 0;

        while(i > 0){
            sum += i%10;
            i /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = 0;

        for(int i = a ; i <= b ; i++){

            if(isPrime(i)){
                if(isNum(i) % 2 == 0){
                    num ++;
                }
            }
        }

        System.out.println(num);
    }
}